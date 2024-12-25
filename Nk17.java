
package nk17;

import java.util.Scanner;

public class Nk17 {

    public static void main(String[] args) {
        
        Scanner jan = new Scanner(System.in);
        System.out.println("enter number");
        int num = jan.nextInt();
        boolean isprime = num > 1;
        
        for (int i = 2; i <= math.sqrt(num); i++) {
        if (num % i == 0) {isprime = false;
         break ; }}
        System.out.println(num +"is" + (isprime ? "a prime number.":"not a prime number"));
        }    
            
        }

    

