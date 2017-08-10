import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

//import { User } from '../components/model/user';

@Injectable()
export class UserService {

  constructor(public http:Http) {
    console.log('Data service connected..');
  }

  getAllUsers(){
    return this.http.get('http://localhost:8080/user')
    .map(res => res.json());
  }
}


