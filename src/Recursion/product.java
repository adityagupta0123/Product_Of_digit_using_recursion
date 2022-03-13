package Recursion;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        System.out.println(prod(n));
    }
    private static int prod(int n){
        if(n %10 == n)
            return n;
        return n%10 * prod(n/10);
    }

}
