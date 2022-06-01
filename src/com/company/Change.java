package com.company;
import java.util.Scanner;
public class Change extends Main {
    int turn=0;
    Printx printx=new Printx();
    Scanner sc=new Scanner(System.in);
    public void zer(int i,int j){
        if (turn % 2 == 0) {
            mainArr[i][j] = "X";
            printx.printm();
        } else {
            mainArr[i][j] = "O";
            printx.printm();
        }
        turn++;
    }
    public void sw(){
        while (turn!=9) {
            int a= sc.nextInt();
            switch (a) {
                case 1:
                    zer(2,0);
                    break;
                case 2:
                  zer(2,1);
                    break;
                case 3:
                    zer(2,2);
                    break;
                case 4:
                    zer(1,0);
                    break;
                case 5:
                    zer(1,1);
                    break;
                case 6:
                    zer(1,2);
                    break;
                case 7:
                    zer(0,0);
                    break;
                case 8:
                    zer(0,1);
                    break;
                case 9:
                    zer(0,2);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            if (    mainArr[0][0]=="X" && mainArr[0][1]=="X" && mainArr[0][2]=="X" ||
                    mainArr[1][0]=="X" && mainArr[1][1]=="X" && mainArr[1][2]=="X" ||
                    mainArr[2][0]=="X" && mainArr[2][1]=="X" && mainArr[0][2]=="X" ||
                    mainArr[0][0]=="X" && mainArr[1][0]=="X" && mainArr[2][0]=="X" ||
                    mainArr[0][1]=="X" && mainArr[1][1]=="X" && mainArr[2][1]=="X" ||
                    mainArr[0][2]=="X" && mainArr[1][2]=="X" && mainArr[2][2]=="X" ||
                    mainArr[0][0]=="X" && mainArr[1][1]=="X" && mainArr[2][2]=="X" ||
                    mainArr[0][2]=="X" && mainArr[1][1]=="X" && mainArr[2][0]=="X" )
            {
                System.out.println("\n player X: win");

         }else if ( mainArr[0][0]=="O" && mainArr[0][1]=="O" && mainArr[0][2]=="O" ||
                    mainArr[1][0]=="O" && mainArr[1][1]=="O" && mainArr[1][2]=="O" ||
                    mainArr[2][0]=="O" && mainArr[2][1]=="O" && mainArr[0][2]=="O" ||
                    mainArr[0][0]=="O" && mainArr[1][0]=="O" && mainArr[2][0]=="O" ||
                    mainArr[0][1]=="O" && mainArr[1][1]=="O" && mainArr[2][1]=="O" ||
                    mainArr[0][2]=="O" && mainArr[1][2]=="O" && mainArr[2][2]=="O" ||
                    mainArr[0][0]=="O" && mainArr[1][1]=="O" && mainArr[2][2]=="O" ||
                    mainArr[0][2]=="O" && mainArr[1][1]=="O" && mainArr[2][0]=="O" )
         {
                System.out.println("\n player O: win");
            }else if (mainArr[0][0]!="_" && mainArr[0][1]!="_" && mainArr[0][2]!="_"
                    && mainArr[1][0]!="_" && mainArr[1][1]!="_" && mainArr[1][2]!="_"
                    && mainArr[2][0]!="_" && mainArr[2][1]!="_" && mainArr[2][2]!="_"){
                System.out.println("\n RaW");
            }
        }
    }
}
