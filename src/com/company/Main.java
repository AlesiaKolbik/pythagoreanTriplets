package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int input=scanner.nextInt();
        for(int i=1;i<=input;i++){
            for(int j=1;j<=input;j++){
                while (resultExpression(i,j)%1==0&&resultExpression(i,j)<=input){
                    System.out.println(i+" "+j+" "+(int)resultExpression(i,j));
                    break;
                }
            }
        }
    }
    public static double resultExpression(int numberFirst, int numberSecond) {
        double result=Math.sqrt(Math.pow(numberFirst,2)+Math.pow(numberSecond,2));
        return result;
    }
}
