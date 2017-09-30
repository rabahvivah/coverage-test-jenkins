package com.rabah.services.data;

public class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "[" +
                "F=" + first +
                ", S=" + second +
                ']';
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public static Pair from(String first, Integer second) {
        return new Pair(first,second);
    }
}
