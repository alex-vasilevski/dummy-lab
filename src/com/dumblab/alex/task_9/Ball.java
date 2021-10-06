package com.dumblab.alex.task_9;

public class Ball {
    private BallColor color;
    private Double weight;

    public Ball(BallColor color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public BallColor getColor() {
        return color;
    }

    public void setColor(BallColor color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
