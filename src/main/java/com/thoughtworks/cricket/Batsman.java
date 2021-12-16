package com.thoughtworks.cricket;

public
class Batsman {
    private static final int maximumNumber = 7;

    public
    int bats() {
        return (int) (Math.random() * maximumNumber);
    }
}

