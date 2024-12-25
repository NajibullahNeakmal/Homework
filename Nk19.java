
package nk19;

import java.util.Scanner;


public class Nk19 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int number;
            System.out.println("enter the an integer ");
            number = input.nextInt();
            boolean isprime = checkPrime(number);
            if (isprime){System.out.println("is aprime number " + number );}
            else {System.out.println("is not aprime number " + number);}
        }
}
    
    @SuppressWarnings("empty-statement")
    private static boolean checkPrime(int number){
    {int num = 0;
    if (num <= 1){return false;}
    for(int i = 2; i<=Math.sqrt(num); i++);{
            int i = 0;
        if (num%i == 0){return false;}
    }
    
    }
    return true;
    }
    }
            
    

