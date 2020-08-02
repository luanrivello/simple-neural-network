package com.belem.program.main;

import com.belem.program.brain.Perceptron;
import org.ejml.simple.SimpleMatrix;

public class App{
    public static void main( final String[] args){

        System.out.println("-----------------------------START-----------------------------");
        
        Perceptron perceptron = new Perceptron(2);
        System.out.println(perceptron.getWeights()[0]);
        System.out.println(perceptron.getWeights()[1]);

        System.out.println("------------------------------END------------------------------");

    }

}
