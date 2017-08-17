import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { AuthenticationService } from './authentication.service';
import 'rxjs/add/operator/toPromise';
 
import { User } from '../model/user';
 
@Injectable()
export class UserService {

    private userUrl = 'http://localhost:8080/user';

    private headers = new Headers({
     'Content-Type': 'application/json',
     'Authorization': 'Bearer ' + this.authenticationService.getToken()
     });

    constructor(
        private http: Http,
        private authenticationService: AuthenticationService) { }
        
    getAll() {
        //return this.http.get(this.userUrl, {headers: this.headers}).toPromise().then((response: Response) => response.json());
        return this.http.get(this.userUrl, {headers: this.headers}).map((response: Response) => response.json());
  }

  


/*
    getAll2() {
        //return this.http.get('/api/users', this.jwt()).map((response: Response) => response.json());
        return this.http
        .get('http://localhost:8080/user', this.jwt()).map((response: Response) => response.json());
    }
 
    getById(id: number) {
        return this.http.get('/api/users/' + id, this.jwt()).map((response: Response) => response.json());
    }
 
    create(user: User) {
        return this.http.post('/api/users', user, this.jwt()).map((response: Response) => response.json());
    }
 
    update(user: User) {
        return this.http.put('/api/users/' + user.id, user, this.jwt()).map((response: Response) => response.json());
    }
 
    delete(id: number) {
        return this.http.delete('/api/users/' + id, this.jwt()).map((response: Response) => response.json());
    }
 
    // private helper methods
 
    private jwt() {
        // create authorization header with jwt token
        let currentUser = JSON.parse(localStorage.getItem('currentUser'));
        if (currentUser && currentUser.token) {
            let headers = new Headers({ 'Authorization': 'Bearer ' + currentUser.token });
            return new RequestOptions({ headers: headers });
        }
    }*/
}