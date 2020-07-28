package com.belem.program.main;

import org.ejml.simple.SimpleMatrix;

public class App{
    public static void main( final String[] args){

        System.out.println("-----------------------------START-----------------------------");
        
        SimpleMatrix mat1, mat2;

        mat1 = new SimpleMatrix(new double[][] {
            new double[] {1, 5},
            new double[] {2, 3},
            new double[] {1 ,7}
          }
        );

        mat2 = new SimpleMatrix(new double[][] {
            new double[] {1, 2, 3, 7},
            new double[] {5, 2, 8, 1}
        });

        System.out.println(mat1.toString().substring(34) + "\n");
        System.out.println(mat2.toString().substring(34) + "\n");
        System.out.println(mat1.mult(mat2).toString().substring(34) + "\n");

        System.out.println("------------------------------END------------------------------");

    }

}
