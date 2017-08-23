import { Buildings } from './townbuilding'
import { TownSoldierType } from './townsoldiertype'

export class Town {   
    name: string;
    points: number;
    pointX: number;
    pointY: number;
    iron: number;
    wood: number;
    clay: number;
    mana: number;
    buildings: Buildings[];
    townSoldierTypes: TownSoldierType[];
}
