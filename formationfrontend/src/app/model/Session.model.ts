import { Former  } from "./Former.model";
import { Learner } from "./Learner.model";
import { Program } from "./Program.model";

export class Session {

    SessionId ?: string;
    SessionTitle ?: string;
    ProgramSession ?: Program;
    FormerSession?: Former;
    LearnersSession?:Array<Learner>;
    }