import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Program } from '../model/Program.model';

type EntityResponseType = HttpResponse<Program>;
type EntityArrayResponseType = HttpResponse<Program[]>;

@Injectable({
  providedIn: 'root',
})
export class ProgramService {
  public resourceUrl = `http://localhost:8080/api/programs`;

  constructor(private http: HttpClient) {}

  create(program: Program): Observable<EntityResponseType> {
    return this.http.post<Program>(this.resourceUrl, program, {
      observe: 'response',
    });
  }

  update(program: Program): Observable<EntityResponseType> {
    return this.http.put<Program>(
      `${this.resourceUrl}/${program.programId}`,
      program,
      {
        observe: 'response',
      }
    );
  }

  find(id: string): Observable<EntityResponseType> {
    return this.http.get<Program>(`${this.resourceUrl}/${id}`, {
      observe: 'response',
    });
  }

  findAll(): Observable<EntityArrayResponseType> {
    return this.http.get<Program[]>(this.resourceUrl, {
      observe: 'response',
    });
  }

  delete(id: string): Observable<HttpResponse<any>> {
    return this.http.delete<any>(`${this.resourceUrl}/${id}`, {
      observe: 'response',
    });
  }
}
