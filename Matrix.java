package ru.ismoke.cyber;

import java.util.Random;

public class Matrix{
    public static void main(String[] args){
        int[][] n = Matrix.create(4);
        Matrix.print(n);
        Matrix.operate(n);
    }
    public static int[][]
    create(int x){
        int[][] cube = new int[x][x];
        for (var i = 0; i<cube.length; i++){
            for (var j = 0; j<cube.length; j++){
                Random rand = new Random();
                cube[i][j] = rand.nextInt(10);
            }
        }
        return cube;
    }
    public static void print(int[][] c){
        for (int i=0;i<c.length;i++){
            for (int j=0;j<c.length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void operate(int[][] v){
        int summa = 0;
        int res = 0;
        int oper = 1;
        for (var i=0;i<v.length;i++){
            for (var j=0;j<v.length;j++){
                if(i<j){
                    summa += v[i][j];
                }
                else if (i>j){
                    res -= v[i][j];
                }
            }
        }
        System.out.println("Summa Chisel:"+summa);
        System.out.println("Proizvedenie chisel:"+oper);
    }
}


