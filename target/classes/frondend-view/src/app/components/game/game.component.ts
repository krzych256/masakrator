import { Component, OnInit } from '@angular/core';

import { User } from '../../model/user';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'game',
  moduleId: module.id,
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.css']
})
export class GameComponent implements OnInit {

  currentUser: User;
  users: User[] = [];

  constructor(private userService: UserService) {
        this.currentUser = JSON.parse(localStorage.getItem('currentUser'));
    }

    ngOnInit() {
        this.loadAllUsers();
    }

    deleteUser(id: number) {
        this.userService.delete(id).subscribe(() => { this.loadAllUsers() });
    }

    private loadAllUsers() {
        this.userService.getAll().subscribe(users => { this.users = users; });
    }
}

    //this.userService.getAllUsers().subscribe((users) => { this.user = users })    
 

