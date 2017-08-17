import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { AuthenticationService } from '../authentication.service';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
  
@Injectable()
export class GameService {

    test: String;

    private headers = new Headers({
        'Content-Type': 'application/json',
        'Authorization': /*'Bearer ' +*/ this.authenticationService.getToken()
    });

    constructor(private http: Http, private authenticationService: AuthenticationService) { }
        
    getPersons(){
        return this.http.get("http://localhost:8080/persons", {headers: this.headers}).map(res => res.json());
    }

    getTest() {
        return  this.http.get('http://localhost:8080/test', {headers: this.headers}).map((response: Response) => response.json());
    }

    getAllData(name: String) {
        return this.http.get('http://localhost:8080/game/' + name, {headers: this.headers} )
        .map(response => response.json().data as Town[]);
        //.map((response: Response) => response.json())
        ;
    }

    getAll() {
        return this.http.get('http://localhost:8080/game/', {headers: this.headers}).map((response: Response) => response.json());
        //return this.http.get('http://localhost:8080/game/', {headers: this.headers}).toPromise().then((response: Response) => response.json());
    }

}

   interface Town {
        id: number;	
        name: String;
        points: number;
        pointX: number;
        pointY: number;
        iron: number;
        wood: number;
        clay: number;
        mana: number;
    }