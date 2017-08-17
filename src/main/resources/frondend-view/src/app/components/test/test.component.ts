import { Component, OnInit } from '@angular/core';
import { GameService } from '../../services/game/game.service';

@Component({
    moduleId: module.id,
    selector: 'app-test',
    template: `
        <h1>Hero</h1>
            <div *ngFor="let person of persons">
            <h4>{{person.email}}</h4>
            <p>{{person.name}}</p>
        </div>   
  ` 
})
export class TestComponent implements OnInit {

    persons: Persons[];
    constructor(private gameService: GameService) { }

    ngOnInit() {
        this.gameService.getPersons().subscribe((persons) => {
            this.persons = persons;
        });
    }

}

interface Persons{
    name: String;
    email: String;
}