package com.belem.program.main;

import com.belem.program.brain.Perceptron;
import org.ejml.simple.SimpleMatrix;
import java.security.SecureRandom;

public class App{
    public static void main( final String[] args){

        System.out.println("-----------------------------START-----------------------------");
        
        Perceptron perceptron = new Perceptron(2);
        double[][] data = new double[100000][2];
        SecureRandom rd = new SecureRandom();
        
        //data
        for (int i = 0; i < data.length; i++) {
            data[i][0] = rd.nextInt(10)-4;
            data[i][1] = rd.nextInt(10)-4;
        }

        //train
        int target;
        for (int i = 0; i < data.length; i++){
            target = sensei(data[i]);
            perceptron.train(data[i], target);
        }

        for (int i = 0; i < 2; i++){
           System.out.println(perceptron.getWeights()[i]); 
        }

        System.out.println("guess: " + (perceptron.guess(new double[] {1.0, 1.0})<0.5 ? "Correct":"Wrong"));

        System.out.println("------------------------------END------------------------------");

    }

    public static int sensei(double[] data){
        return data[1] > data[0] ? 1:0;
    }

}
