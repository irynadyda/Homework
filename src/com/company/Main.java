package com.company;
import java.util.Scanner;

public class Main {


    public void J() {

        int n;
        int x1;

        System.out.println("vvedite chislo n:");
        Scanner y=new Scanner(System.in);
        if(y.hasNextInt()){
            n =y.nextInt();

            System.out.print("chislo a na oborot: ");
            while (n % 10 > 0)
            {

                x1 = n % 10;
                n = (n - x1) / 10;
                System.out.print(x1);
            }

            System.out.print("\n");

        }
    }

    public static void main(String[] args) {

        new Main().J();
    }

}
