import { Component, OnInit } from '@angular/core';

import { GameService } from '../../services/game/game.service';

@Component({
    moduleId: module.id,
    selector: 'navbar',    
    templateUrl: 'navbar.component.html'
})

export class NavbarComponent implements OnInit{
  
    model: any;

    constructor(private gameService: GameService) { }

    ngOnInit() {
        this.gameService.getCurrentUserData().subscribe((model) => {this.model = model;});
    }

}