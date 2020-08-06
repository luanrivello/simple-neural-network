package com.belem.program.brain;
    
public class ActivationFunctions{
    //https://en.wikipedia.org/wiki/Activation_function
    
    static double sing(double num){
        if(num >= 0){
            return 1;
        }else{
            return 0;
        }
    }

    //sigmoid => x / ( 1 + e^-x)
    static double sigmoid(double num){
        return 1 / (1 + Math.exp(-num));
    }

    //tanh(x)
    static double tanh(double num){ 
        return Math.tanh(num);
    }

    //swish => x * sigmoid(x) 
    static double swish(double num){
        return num * sigmoid(num);
    }

    //softplus => ln(1 + e^x)
    static double softplus(double num){
        return Math.log(1 + Math.exp(num));
    }

    //mish => x * tanh(softplus(x))
    static double mish(double num){
        return num * tanh(softplus(num));
    }

}
    
    
    
    
    
    