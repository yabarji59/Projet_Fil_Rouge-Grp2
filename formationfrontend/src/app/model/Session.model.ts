import { Former } from './Former.model';
import { Learner } from './Learner.model';
import { Program } from './Program.model';

export class Session {
  sessionId?: string;
  sessionTitle?: string;
  programSession?: Program;
  formerSession?: Former;
  learnersSession?: Array<Learner>;
}
