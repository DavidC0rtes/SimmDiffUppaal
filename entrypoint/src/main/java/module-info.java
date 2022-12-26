module diffCalculator {
    requires info.picocli;
    requires org.antlr.antlr4.runtime;

    opens entrypoint;
    opens Parser.Antlr;

    exports Parser.Antlr;
    exports entrypoint;
}