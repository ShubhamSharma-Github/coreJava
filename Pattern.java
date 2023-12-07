package Day1;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter a number");
        int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }


    }
}
