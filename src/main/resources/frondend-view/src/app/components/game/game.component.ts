import { Component, OnInit } from '@angular/core';

import { User } from '../../model/user';
import { GameService } from '../../services/game/game.service';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'game',
  moduleId: module.id,
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.css']
})
export class GameComponent implements OnInit {

  currentUser: User;
  test: any;
  town: Town[] = [];
 


  users: User[] = [];
  

  constructor(private gameService: GameService, private userService: UserService) {
        this.currentUser = JSON.parse(localStorage.getItem('currentUser'));       
    }

    ngOnInit() {
        //this.loadAllUsers();
        //this.test = JSON.parse(this.gameService.getTest());
        this.test = this.gameService.getTest();       
        this.loadAllUsers();
    }

    deleteUser(id: number) {
    //    this.userService.delete(id).subscribe(() => { this.loadAllUsers() });
    }

    private loadAllUsers() {
        this.userService.getAll().subscribe(users => { this.users = users; });
        this.gameService.getAll().subscribe(towns => { this.town = towns; });
    }
}

    //this.userService.getAllUsers().subscribe((users) => { this.user = users })    
 
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

