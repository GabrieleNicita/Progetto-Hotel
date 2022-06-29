import { TipoCamera } from "./TipoCamera";
import { Utente } from "./Utente";

export interface Richiesta{
    dataRichiesta:Date,
    inizio:Date,
    fine:Date,
    utente:Utente,
    tipo:TipoCamera
}