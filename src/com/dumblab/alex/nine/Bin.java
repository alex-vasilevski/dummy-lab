package com.dumblab.alex.nine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bin {

    private List<Ball> balls;

    public Bin(){
        this.balls = new ArrayList<>();
    }

    public Bin(List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void addBall(Ball ball){
        balls.add(ball);
    }

    public List<Ball> getAllBallsByColor(BallColor color){
        return balls
                .stream()
                .filter(ball -> ball.getColor().equals(color))
                .collect(Collectors.toList());
    }

    public Double getBinMass(){
        return balls
                .stream()
                .mapToDouble(Ball::getWeight)
                .sum();
    }
}
