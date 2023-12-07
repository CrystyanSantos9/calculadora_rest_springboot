package dev.cryss.calculadora;

public class Greeting {

    private final long number;
    private final String name;

    public Greeting(long number, String name) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }
}
