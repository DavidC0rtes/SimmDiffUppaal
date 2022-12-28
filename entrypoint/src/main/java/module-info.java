module diffCalculator {
    requires info.picocli;
    requires org.antlr.antlr4.runtime;
    requires engine;

    opens entrypoint;
    opens Parser.Antlr;

    exports Parser.Antlr;
    exports entrypoint;
}