import { Component, OnInit } from '@angular/core';

import { User } from '../../model/user';
import { Town } from '../../model/town';
import { LoggedInUser } from '../../model/loggedinuser';
import { GameService } from '../../services/game/game.service';

@Component({
  selector: 'game',
  moduleId: module.id,
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.css']
})
export class GameComponent implements OnInit {

  currentUser: User;
  currentUserData: any;// LoggedInUser;
  towns: Town;   
  cos: any;

  constructor(private gameService: GameService) { }

    ngOnInit() {
        this.currentUser = JSON.parse(localStorage.getItem('currentUser'));
        //this.gameService.getTown().subscribe((towns) => {this.towns = towns;});
        this.gameService.getCurrentUserData().subscribe((currentUserData) => {this.currentUserData = currentUserData;});      
    }

    public upLevel(x: number): void {
      //this.cos = this.currentUserData;
      //this.cos.userTowns[0].town.buildings[0].level ++;
      for(let i = 0; i < this.currentUserData.userTowns.length; i++){
        if(this.currentUserData.userTowns[i].id == x) {
          this.currentUserData.userTowns[0].town.buildings[0].level ++;
          console.log('wiedz ze  cos sie dzieje');
        }
      }
      

      console.log('upLevel');
    }

    downLevel(): void {
      console.log('downLevel');
    }
}