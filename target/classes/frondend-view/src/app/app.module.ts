import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';

import { routing } from './app.routing';
import { AuthGuard } from './components/guards/auth.guard';

import { AlertService } from './services/alert/alert.service';
import { AuthenticationService } from './services/authentication/authentication.service';
import { GameService } from './services/game/game.service';
import { UserService } from './services/user/user.service';

import { AdminComponent } from './components/admin/admin.component';
import { AppComponent }  from './app.component';
import { AlertComponent } from './components/alert/alert.component';
import { GameComponent } from './components/game/game.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { TestComponent } from './components/test/test.component';
import { NavbarComponent } from './components/navbar/navbar.component';


import { PersonsComponent } from './components/persons/persons.component';

@NgModule({
  declarations: [
    AppComponent,
    GameComponent,
    AlertComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    PersonsComponent,
    AdminComponent,
    TestComponent,
    NavbarComponent,
      
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    HttpClientModule,
    routing,
    
  ],
  providers: [
    AuthGuard,
    AlertService,
    AuthenticationService,
    GameService,
    UserService   
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
