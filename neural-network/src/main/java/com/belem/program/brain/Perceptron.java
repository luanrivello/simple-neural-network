package com.belem.program.brain;

import java.security.SecureRandom;

public class Perceptron{
    //weights
    private double[] weights;
    
    //learning rate
    private double lr = 0.1;

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

        for(i = 0; i < weights.length; i++){
            sum = sum + weights[i]*inputs[i];
        }

        return ActivationFunctions.sigmoid(sum);
    
    }

    public void train(double[] inputs, int target){
        double guess = guess(inputs);
        double error = target - guess;

        for (int i = 0; i < weights.length; i++){
            weights[i] = weights[i] + error*inputs[i]*lr;
        }

    }

    public double[] getWeights() {
        return weights;
    }

}