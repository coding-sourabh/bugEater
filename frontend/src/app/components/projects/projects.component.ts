import { Component, OnInit } from '@angular/core';
import { Project } from 'src/app/Project';
import { ProjectService } from 'src/app/services/project.service';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css']
})
export class ProjectsComponent implements OnInit{

  projects !: Project[];

  constructor(private projectService: ProjectService) {}

  ngOnInit(): void {
    this.getProjects();
  }

  getProjects() {
    this.projectService.getProjects().subscribe(data => {
      this.projects = data;
      console.log(data);
    })
  }
  
}
