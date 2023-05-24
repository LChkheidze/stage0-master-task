package com.epam.loops;


public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for(int i=1; i<=cathetusLength; i++){
            int numOfSpaces = cathetusLength - i;

            printString(" ", numOfSpaces);

            printSequenceBack(i);

            printSequenceForward(i+1);

            System.out.println();


        }
    }

    public static void printString(String str, int numOfTimes){
        for(int i=0; i<numOfTimes;i++){
            System.out.print(str);
        }
    }

    public static void printSequenceBack(int n){
        for(int k=n; k>0; k--){
            System.out.print(k);
        }
    }

    public static void printSequenceForward(int n){
        for(int k=2; k<n; k++){
            System.out.print(k);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

