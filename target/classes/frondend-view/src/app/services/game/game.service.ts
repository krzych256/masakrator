import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { AuthenticationService } from '../authentication/authentication.service';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
  
@Injectable()
export class GameService {

    private headers = new Headers({
        'Content-Type': 'application/json',
        'Authorization': this.authenticationService.getToken()
    });

    constructor(private http: Http, private authenticationService: AuthenticationService) { }
        
    getTown(){
        return this.http.get("http://localhost:8080/town", {headers: this.headers}).map(res => res.json());
    } 

    getPersons(){
        return this.http.get("http://localhost:8080/persons", {headers: this.headers}).map(res => res.json());
    } 

}