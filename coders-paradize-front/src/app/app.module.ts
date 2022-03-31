import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { MustReadComponent } from './must-read/must-read.component';
import { GoodiesComponent } from './goodies/goodies.component';
import { EvenementsComponent } from './evenements/evenements.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [AppComponent, NavBarComponent, MustReadComponent, GoodiesComponent, EvenementsComponent, HomeComponent],
  imports: [BrowserModule, AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
