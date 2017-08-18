import { Component, OnInit } from '@angular/core';

import { User } from '../../model/user';
import { Town } from '../../model/town';
import { GameService } from '../../services/game/game.service';

@Component({
  selector: 'game',
  moduleId: module.id,
  templateUrl: './game.component.html',
  styleUrls: ['./game.component.css']
})
export class GameComponent implements OnInit {

  currentUser: User;
  towns: Town;   

  constructor(private gameService: GameService) { }

    ngOnInit() {
        this.currentUser = JSON.parse(localStorage.getItem('currentUser'));
        this.gameService.getTown().subscribe((towns) => {this.towns = towns;});
    }
}