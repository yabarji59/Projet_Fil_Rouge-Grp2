import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Former } from "../model/Former.model";

const baseUrl = "http://localhost:8080/api/formers";

@Injectable({
    providedIn: "root",
  })
  export class FormerService {
    constructor(private http: HttpClient) {}

    list(): Observable<any> {
        return this.http.get(baseUrl);
    }

    findByName(name: string): Observable<any> {
        return this.http.get(`${baseUrl}?name=${name}`);
      }

    get(id: any): Observable<any> {
        return this.http.get(`${baseUrl}/${id}`);
      }

      create(data: Former): Observable<any> {
        return this.http.post(baseUrl, data);
      }

      update(id: string, data: Former): Observable<any> {
        return this.http.put(`${baseUrl}/${id}`, data);
      }

      delete(id: string): Observable<any> {
        return this.http.delete(`${baseUrl}/${id}`);
      }
  }  
