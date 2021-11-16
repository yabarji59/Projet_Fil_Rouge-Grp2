import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Session } from '../model/Session.model';

type EntityResponseType = HttpResponse<Session>;
type EntityArrayResponseType = HttpResponse<Session[]>;

@Injectable({
  providedIn: 'root',
})
export class SessionService {
  public resourceUrl = `http://localhost:8080/api/sessions`;

  constructor(private http: HttpClient) {}

  create(session: Session): Observable<EntityResponseType> {
    return this.http.post<Session>(this.resourceUrl, session, {
      observe: 'response',
    });
  }

  update(session: Session): Observable<EntityResponseType> {
    return this.http.put<Session>(
      `${this.resourceUrl}/${session.sessionId}`,
      session,
      {
        observe: 'response',
      }
    );
  }

  find(id: string): Observable<EntityResponseType> {
    return this.http.get<Session>(`${this.resourceUrl}/${id}`, {
      observe: 'response',
    });
  }

  findAll(): Observable<EntityArrayResponseType> {
    return this.http.get<Session[]>(this.resourceUrl, {
      observe: 'response',
    });
  }

  delete(id: string): Observable<HttpResponse<any>> {
    return this.http.delete<any>(`${this.resourceUrl}/${id}`, {
      observe: 'response',
    });
  }
}
