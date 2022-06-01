package com.company;

public  class  Printx extends Main {
    public void printm(){
        for(int i=0; i<3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                String a = mainArr[i][j];
                System.out.format("%s \t",a);
            }
        }
    }
}
