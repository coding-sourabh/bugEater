import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProjectsComponent } from './components/projects/projects.component';
import { HomeComponent } from './components/home/home.component';
import { UserProfileComponent } from './components/user-profile/user-profile.component';
import { EventsComponent } from './components/events/events.component';
import { AddProjectComponent } from './components/add-project/add-project.component';

const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'project', component:ProjectsComponent},
  {path:'profile', component:UserProfileComponent},
  {path:'events', component:EventsComponent},
  {path:'addproject', component:AddProjectComponent},
  {path:'**', redirectTo:'', pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
