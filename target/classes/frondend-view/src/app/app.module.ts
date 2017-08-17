import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { routing } from './app.routing';
import { AuthGuard } from './components/guards/auth.guard';

import { AlertService } from './services/alert.service';
import { AuthenticationService } from './services/authentication.service';
import { UserService } from './services/user.service';
import { GameService } from './services/game/game.service';

import { AdminComponent } from './components/admin/admin.component';
import { AppComponent }  from './app.component';
import { AlertComponent } from './components/alert/alert.component';
import { GameComponent } from './components/game/game.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { TestComponent } from './components/test/test.component';


//import { LoginComponent2 } from './components/login/login.component';
import { PersonsComponent } from './components/persons/persons.component';
//import { UserService2 } from './services/user.service';

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
    TestComponent   
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    routing
  ],
  providers: [
    AuthGuard,
    AlertService,
    AuthenticationService,
    GameService,
    UserService,

    // providers used to create fake backend
   /// fakeBackendProvider,
    //MockBackend,
    //BaseRequestOptions
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
