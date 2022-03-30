import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EvenementsComponent } from './evenements/evenements.component';
import { GoodiesComponent } from './goodies/goodies.component';
import { MustReadComponent } from './must-read/must-read.component';

const routes: Routes = [
  { path: '', component: MustReadComponent },
  { path: 'goodies', component: GoodiesComponent },
  { path: 'evenements', component: EvenementsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
