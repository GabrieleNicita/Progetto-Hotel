import { Camera } from "./Camera";
import { Richiesta } from "./Richiesta";

export interface Prenotazione{
    "idPrenotazione":number,
    "inizioPerno":Date,
    "finePerno":Date,
    "richiesta":Richiesta,
    "camera":Camera,
    "soggiorno":[{"idSoggiorno":number}]

}