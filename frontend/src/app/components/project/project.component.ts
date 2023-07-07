import { Component, Input } from '@angular/core';
import { Project } from 'src/app/Project';

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.css']
})
export class ProjectComponent {
  // projectName:string = "UI/UX Designer";
  // projectDesc:string ="Lorem ipsum dolor sit amet consectetur, adipisicing elit. Reiciendis provident maxime dolores corporis ad dolore maiores voluptatibus temporibus sed. Odit aliquam praesentium distinctio nisi minima culpa cupiditate voluptatem fugiat quo";
  // projectDuration:number = 3;
  // projectStipend:number = 15000;
  // projectVacancy:number = 30;
  // projectLocation:string = "BLR";
  // projectOrg:string = "Infosys";
  // projectStartDate!:Date;
  // projectMentor:string = "Alex";

  @Input() project !: Project;
}
