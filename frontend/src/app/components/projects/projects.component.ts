import { Component } from '@angular/core';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css']
})
export class ProjectsComponent {
  projectName:string = "Developer";
  projectDesc:string ="Lorem ipsum dolor sit amet consectetur, adipisicing elit. Reiciendis provident maxime dolores corporis ad dolore maiores voluptatibus temporibus sed. Odit aliquam praesentium distinctio nisi minima culpa cupiditate voluptatem fugiat quo";
  projectDuration:number = 3;
  projectStipend:number = 15000;
  projectVacancy:number = 30;
  projectLocation:string = "BLR";
  projectOrg:string = "Infosys";
  projectStartDate!:Date;
  projectMentor:string = "Alex";
}
