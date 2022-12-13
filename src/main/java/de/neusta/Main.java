package de.neusta;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            final var inputStream = new ByteArrayInputStream("{1,2,{31,32}}".getBytes());

            final var errorListener = new ArrayErrorListener();

            final var lexer = new ArrayLexer(CharStreams.fromStream(inputStream));
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorListener);

            final var tokenStream = new CommonTokenStream(lexer);

            final var parser = new ArrayParser(tokenStream);

            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            parser.expr();

        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}