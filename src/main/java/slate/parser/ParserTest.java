package slate.parser;

import org.antlr.runtime.ANTLRInputStream;

import java.io.IOException;

public class ParserTest {

    public static void main(String[] args) {
        try {
            ANTLRInputStream stream = new ANTLRInputStream(System.in);
        }catch(IOException e){
            e.printStackTrace();
        }


    }


}
