
package nk18;

import java.util.Scanner;


public class Nk18 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("enter the integer : ");
        int number = input.nextInt();
        int Q = 0;
        int reversednumber = 0;
        while(number != 0){int digit = number %10;
        reversednumber = reversednumber*10+digit;
        number/=10;
        System.out.println(" reversed number is " + reversednumber);
    }
    
    }}
