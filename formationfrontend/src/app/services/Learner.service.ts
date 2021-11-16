import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Learner } from "../model/Learner.model";

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
  list(): Observable<any> {
    return this.http.get(baseUrl);
  }

  /**
   * Get a list of learners by name
   * 
   * @param name 
   * @returns http get request
   */
  findByName(name: string): Observable<any> {
    return this.http.get(`${baseUrl}?name=${name}`);
  }

  /**
   * Find a learner by id
   * 
   * @param id 
   * @returns http get request
   */
  get(id: any): Observable<any> {
    return this.http.get(`${baseUrl}/${id}`);
  }

  /**
   * Create a new learner or Update
   * 
   * @param data 
   * @returns http post request
   */
  createOrUpdate(data: Learner): Observable<any> {
    return this.http.post(baseUrl, data);
  }

  /**
   * Delete a learner
   * 
   * @param id 
   * @returns http delete request
   */
  delete(id: string): Observable<any> {
    return this.http.delete(`${baseUrl}/${id}`);
  }


}