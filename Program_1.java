/* Write a menu driven program using switch case statement to accept the radius of circle and perform
following task
1. Area of Circle.
2. Circumference of circle.
For incorrect choice display appropriate message.
*/
import java.util.Scanner;
class Program_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Main menu");
        System.out.println("*****");
        System.out.println("1 for area");
        System.out.println("2 For circumference");

        System.out.println("...................");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        
        
        switch(ch){
            case 1:
                double ar = 3.14*r*r;
                System.out.println("The area of the circle is: "+ar);
                break;
            case 2:
                double c = 2*3.14*r;
                System.out.println("Circumference: "+c);
                break;
            default:
                System.out.println("Invalid choice !");
            }
        
    }
}

