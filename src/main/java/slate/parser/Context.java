package slate.parser;

import org.antlr.v4.runtime.ParserRuleContext;

public class Context {
    //Interface for context hashmap
    interface contextInterface {
        public ParserRuleContext open(SlateParser parser);
    }

    //SAY
    static class sayContext implements contextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) {
            return parser.saycomm();
        }
    }

    //SHOUT
    static class shoutContext implements contextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) {
            return parser.shoutcomm();
        }
    }

    //PICKUP
    static class pickupContext implements contextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) {
            return parser.pickupcomm();
        }
    }

    //HELP
    static class helpContext implements contextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) {
            return parser.helpcomm();
        }
    }

    //EXIT
    static class exitContext implements contextInterface {
        @Override
        public ParserRuleContext open(SlateParser parser) {
            return parser.exitcomm();
        }
    }
}
