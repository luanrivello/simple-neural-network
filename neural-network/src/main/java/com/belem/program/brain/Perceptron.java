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

        return actFunc(sum);
    
    }

    //x / ( 1 + e^-x)
    private static double sigmoid(double num){
        return num / (1 + Math.exp(-num));
    }

    //x * sigmoid(x) 
    private static double swish(double num){
        return num * sigmoid(num);
    }

    //Activation function
    private double actFunc(double num){
        return swish(num);
    }

    public double[] getWeights() {
        return weights;
    }

}