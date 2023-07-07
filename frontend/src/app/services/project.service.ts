import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Project } from '../Project';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  private baseURL = "http://localhost:8088/project/all";

  constructor(private httpClient: HttpClient) { }

  getProjects() : Observable<Project[]> {
    return this.httpClient.get<Project[]>(this.baseURL);
  }

}
