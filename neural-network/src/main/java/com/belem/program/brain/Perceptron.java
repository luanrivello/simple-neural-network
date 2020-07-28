package com.belem.program.brain;

public class Perceptron{

    private double[] weights;

    private Perceptron(int wqtd) {
        weights = new double[wqtd];
    }

    private Perceptron(double[] weights) {       
        this.weights = weights;
    }

    public double guess(double[] inputs){
        double sum = 0;
        int i;

        for(i = 0; i < weights.length;){
            sum = sum + weights[i]*inputs[i];
        }

        return ActivationFunctions.mish(sum);
    
    }

    public double[] getWeights() {
        return weights;
    }

}