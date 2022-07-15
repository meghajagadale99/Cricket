package com.thoughtworks.cricket;

public
class Bowler {
    private static final int maximumNumber = 7;

    public
    int bowl() {
        return (int) (Math.random() * maximumNumber);
    }
}
