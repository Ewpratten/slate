package slate.parser;

import slate.parser.Commands;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.junit.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParserTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    private CharStream toCharStream(String input) throws IOException {
        InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        return CharStreams.fromStream(stream, StandardCharsets.UTF_8);
    }

    @Before
    public void initConsole() {

        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void echoTest() {
        boolean io_success = true;
        try {
            Commands.parseCommand(toCharStream("say \"hello\""));
        } catch (IOException e) {
            io_success = false;
        }

        assert io_success == true;
        assert outContent.toString().equals("hello\n");

    }

    @After
    public void resetConsole() {

        System.setOut(originalOut);
        System.setErr(originalErr);
    }

}