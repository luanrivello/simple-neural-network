package com.belem.program.brain;

import java.util.Properties;

public class NeuralNetwork {
    
    private int input;
    private int hidden;
    private int output;

    public NeuralNetwork (int input, int hidden, int output){
        this.input = input;
        this.hidden = hidden;
        this.output = output;
    } 

    public int getInput() { 
        return input;
    }

    public int getHidden() { 
        return hidden;
    }

    public int getOutput() { 
        return output;
    }
}