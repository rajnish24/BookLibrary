import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class LibraryService {
  constructor(private http: HttpClient) {}

  getLibraryList(): Observable<Object> {
    return this.http.get('http://localhost:8080/api/library/v1/list');
  }
}
