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

    public double guess(double[] inputs){
        double sum = 0;
        int i;

        for(i = 0; i < weights.length;){
            sum = sum + weights[i]*inputs[i];
        }

        return ActivationFunctions.sigmoid(sum);
    
    }

    public double[] getWeights() {
        return weights;
    }

}