import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './components/home/home.component';
import { GameComponent } from './components/game/game.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { AuthGuard } from './components/guards/auth.guard';
import { PersonsComponent } from './components/persons/persons.component';
import { AdminComponent } from './components/admin/admin.component';
import { TestComponent } from './components/test/test.component';

const appRoutes: Routes = [
    { path: '', component: HomeComponent },
    { path: 'login', component: LoginComponent },
    { path: 'register', component: RegisterComponent },
    { path: 'game', component: GameComponent, canActivate: [AuthGuard] },
    { path: 'admin', component: AdminComponent, canActivate: [AuthGuard] },

    { path: 'persons', component: PersonsComponent, canActivate: [AuthGuard] },
    { path: 'register', component: RegisterComponent },
    { path: 'test', component: TestComponent },

    // otherwise redirect to home
    { path: '**', redirectTo: '' }
];

export const routing = RouterModule.forRoot(appRoutes);