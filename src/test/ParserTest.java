package slate;

import java.util.Scanner;

import static slate.parser.Commands.getInput;

public class ParserTest {

    //Scanner
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new ParserTest();
    }

    public ParserTest() {
        while (true) {
            getInput();
        }
    }
}