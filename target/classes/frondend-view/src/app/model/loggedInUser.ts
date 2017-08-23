import { UserTown } from './userTown'

export class LoggedInUser {
    id: number;
    premium: number;
    allpoints: number;
    userTowns: UserTown[];    
}