package com.belem.program.brain;

import java.security.SecureRandom;

public class Perceptron{
    private double[] weights;

    public Perceptron(){
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < weights.length; i++){
            weights[i] = random.nextGaussian(); 
        }
    }

    public Perceptron(int wqtd) {
        weights = new double[wqtd];
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < weights.length; i++){
            weights[i] = Math.abs(random.nextGaussian()) ; 
        }
    }

    public Perceptron(double[] weights) {       
        this.weights = weights;
    }

    public int guess(double[] inputs){
        double sum = 0;
        int i;

        for(i = 0; i < weights.length; i++){
            sum = sum + weights[i]*inputs[i];
        }

        return 0.5 < ActivationFunctions.sigmoid(sum) ? 1:0;
    
    }

    public void train(double[] inputs, int target){
        int guess = guess(inputs);
        int error = target - guess;
        double lr = 0.1;

        for (int i = 0; i < weights.length; i++){
            weights[i] = weights[i] + error*inputs[i]*lr;
        }

    }

    public double[] getWeights() {
        return weights;
    }

}