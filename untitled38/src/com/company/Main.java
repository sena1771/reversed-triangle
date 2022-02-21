package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Digit value: ");
        int a= inp.nextInt();
        for(int i=1;i<a;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }

            for(int j=0;j<(2*(a-i)-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
