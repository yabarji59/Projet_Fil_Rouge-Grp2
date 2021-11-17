import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Former } from '../model/Former.model';

type EntityResponseType = HttpResponse<Former>;
type EntityArrayResponseType = HttpResponse<Former[]>;

@Injectable({
  providedIn: 'root',
})
export class FormerService {
 
  public resourceUrl = `http://localhost:8080/api/formers`;

  constructor(private http: HttpClient) {}

  create(former: Former): Observable<EntityResponseType> {
    return this.http.post<Former>(this.resourceUrl, former, {
      observe: 'response',
    });
  }

  update(former: Former): Observable<EntityResponseType> {
    return this.http.put<Former>(
      `${this.resourceUrl}/${former.formerId}`,
      former,
      {
        observe: 'response',
      }
    );
  }

  find(id: string): Observable<EntityResponseType> {
    return this.http.get<Former>(`${this.resourceUrl}/${id}`, {
      observe: 'response',
    });
  }

  findAll(): Observable<EntityArrayResponseType> {
    return this.http.get<Former[]>(this.resourceUrl, {
      observe: 'response',
    });
  }

  delete(id: string): Observable<HttpResponse<any>> {
    return this.http.delete<any>(`${this.resourceUrl}/${id}`, {
      observe: 'response',
    });
  }
}
