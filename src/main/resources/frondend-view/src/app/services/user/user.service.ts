import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { AuthenticationService } from '../authentication/authentication.service';
import { Observable } from 'rxjs/Rx';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import 'rxjs/add/operator/map';

import { User } from '../../model/user';

@Injectable()
export class UserService {

    private headers = new Headers({
        'Content-Type': 'application/json',
        'Authorization': this.authenticationService.getToken()
    });

    constructor(private http: Http, private authenticationService: AuthenticationService) { }
 
    create(user: User) {
        return this.http.post("http://localhost:8080/register", user);//.map((response: Response) => response.json());
    }

    create2(user: User): Observable<String> {
        return this.http.post("http://localhost:8080/register", user)
            .map((response: Response) => {
                if (response.status === 200) {
                    response.json();                    
                }
            }).catch((error: any) => {
                if (error.status === 400) {
                    return Observable.throw(new Error(error.status));
                }                
            });
    }

}