import { HttpClient, HttpResponse } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Learner } from "../model/Learner.model";

type EntityResponseType = HttpResponse<Learner>;
type EntityArrayResponseType = HttpResponse<Learner[]>;

const baseUrl = "http://localhost:8080/api/learners";

@Injectable({
  providedIn: "root",
})
export class LearnerService {
  constructor(private http: HttpClient) {}

  /**
   * Get the list of all learners
   * 
   * @returns http get request
   */
  findAll(): Observable<EntityArrayResponseType> {
    return this.http.get<Learner[]>(baseUrl, {
      observe: 'response',
    });
  }

  /**
   * Get a list of learners by name
   * 
   * @param name 
   * @returns http get request
   */
  findByName(name: string): Observable<EntityArrayResponseType> {
    return this.http.get<Learner[]>(`${baseUrl}?name=${name}`, {
      observe: 'response',
    });
  }

  /**
   * Find a learner by id
   * 
   * @param id 
   * @returns http get request
   */
   find(id: string): Observable<EntityResponseType> {
    return this.http.get<Learner>(`${baseUrl}/${id}`, {
      observe: 'response',
    });
  }

  /**
   * Create a new learner or Update
   * 
   * @param data 
   * @returns http post request
   */
  createOrUpdate(data: Learner): Observable<EntityResponseType> {
    return this.http.post(baseUrl, data,
      {
        observe: 'response',
      });
  }

  /**
   * Delete a learner
   * 
   * @param id 
   * @returns http delete request
   */
  delete(id: string): Observable<HttpResponse<any>> {
    return this.http.delete(`${baseUrl}/${id}`,
    {
      observe: 'response',
    });
  }


}