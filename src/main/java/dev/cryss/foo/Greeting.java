package dev.cryss.foo;

public class Greeting {

    private long number;
    private String name;

    public String getName() {
        return name;
    }

    public Greeting(long number, String name) {
        this.name = name;
        this.number = number;
    }

    public long getNumber() {
        return number;
    }
}
