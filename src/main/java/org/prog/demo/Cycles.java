package org.prog.demo;

public class Cycles
{

    public static void main(String[] args)
    {
        int j = 0;
        while (j <= 100){
            System.out.println("Loading progress " + j + "%");
            j++;
        }
        for (int i = 0; i < 10; i++) {
        System.out.println("i = " + i);
    }

    }
}
