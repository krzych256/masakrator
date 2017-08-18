export class Town {
    id: number;
    name: string;
    points: number;
    pointX: number;
    pointY: number;
    iron: number;
    wood: number;
    clay: number;
    mana: number;
    buildings: Buildings[];
    armyDetail: ArmyDetail[];
}

interface Buildings {
    id: number;
    name: string;
    level: number;
    description: string;
}

interface ArmyDetail {

}