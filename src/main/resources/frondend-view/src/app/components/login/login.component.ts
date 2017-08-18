import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';

import { AlertService } from '../../services/alert/alert.service';
import { AuthenticationService } from '../../services/authentication/authentication.service';
import { AlertComponent } from '../../components/alert/alert.component'

@Component({
    moduleId: module.id,
    selector: 'login-page',
    templateUrl: 'login.component.html'
})

export class LoginComponent implements OnInit {
    model: any = {};
    loading = false;
    returnUrl: string;

    constructor(
        private route: ActivatedRoute,
        private router: Router,
        private authenticationService: AuthenticationService,
        private alertService: AlertService) { }

    ngOnInit() {
        // reset login status
        this.authenticationService.logout();

        // get return url from route parameters or default to '/'
        this.returnUrl = this.route.snapshot.queryParams['returnUrl'] || '/';
    }

    login() {
        this.loading = true;
        this.authenticationService.login(this.model.username, this.model.password)
            .subscribe(result => {
                    if (result === true) {
                        // login successful
                        this.router.navigate([this.returnUrl]);
                    } else {
                    // login failed
                    this.alertService.error("błąd");
                    this.loading = false;
                    }                    
                },
                error => {
                    this.alertService.error(error);
                    this.loading = false;
                });
    }

}