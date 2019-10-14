package slate.parser;

import org.antlr.v4.runtime.ParserRuleContext;

public class Context {
    //Interface for context hashmap
    interface ContextInterface {
        public ParserRuleContext open(SlateParser parser);
    }

    //SAY
    static class SayContext implements ContextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) {
            return parser.saycomm();
        }
    }

    //SHOUT
    static class ShoutContext implements ContextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) {
            return parser.shoutcomm();
        }
    }

    //PICKUP
    static class PickupContext implements ContextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) {
            return parser.pickupcomm();
        }
    }

    //LEAVE
    static class LeaveContext implements ContextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) {
            return parser.leavecomm();
        }
    }

    //HELP
    static class HelpContext implements ContextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) {
            return parser.helpcomm();
        }
    }

    //CHECK DOORS
    static class CheckDoorsContext implements ContextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) { return parser.checkdoorscomm(); }
    }

    //SEARCH ROOM
    static class SearchContext implements ContextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) { return parser.searchcomm(); }
    }

    //PEEK
    static class PeekContext implements ContextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) { return parser.peekcomm(); }
    }

    //MOVE
    static class MoveContext implements ContextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) { return parser.movecomm(); }
    }

    //OPEN
    static class OpenContext implements ContextInterface{
        @Override
        public ParserRuleContext open(SlateParser parser) { return parser.opencomm(); }
    }

    //CLOSE
    static class CloseContext implements ContextInterface{
        @Override
        public ParserRuleContext open(SlateParser parser) { return parser.closecomm(); }
    }

    //EXIT
    static class ExitContext implements ContextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) {
            return parser.exitcomm();
        }
    }
}
