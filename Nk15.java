

package nk15;


public class Nk15 {

    
    public static void main(String[] args) {
    double a,b,c,root1,root2;
    a = 2;
    b = 6;
    c = 3;
    root1 = (-b- (Math.sqrt(b*b-4*a*c))) / 2*a;
    root2 = (-b+ (Math.sqrt(b*b-4*a*c))) / 2*a;
    
    System.out.println("the value of root1="+root1);
    
    System.out.println("the value of root2="+root2);

    }
    
}
