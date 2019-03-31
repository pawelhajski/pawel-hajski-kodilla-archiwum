package com.kodilla.archive.Module2_6;

public class Marks {

    private Integer english;
    private Integer mathematics;
    private Integer physics;
    private Integer pe;

    public Marks(Integer english, Integer mathematics, Integer physics, Integer pe) {
        this.english = english;
        this.mathematics = mathematics;
        this.physics = physics;
        this.pe = pe;
    }

    public Double average() {
        int sum = english + mathematics + physics + pe;
        Double average = (double) sum / 4;
        return average;
    }
}
