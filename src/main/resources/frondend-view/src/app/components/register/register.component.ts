import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { AlertComponent } from '../../components/alert/alert.component';

import { AlertService } from '../../services/alert/alert.service';
import { UserService } from '../../services/user/user.service';


@Component({
    moduleId: module.id,
    templateUrl: 'register.component.html'
})

export class RegisterComponent {
    model: any = {};
    loading = false;

    constructor(
        private router: Router,
        private alertService: AlertService,
        private userService: UserService) { }

    register() {
        this.loading = true;        
        this.userService.create(this.model)
            .subscribe(
                data => {                    
                    this.alertService.success('Registration successful', true);
                    this.router.navigate(['/login']);
                    this.alertService.success('Registration successful', true);
                },
                error => {                    
                    this.alertService.error('Email or user already exists!');
                    this.loading = false;
                });
    }

}