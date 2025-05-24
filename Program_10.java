/*The volume of solids, viz. cuboid, cylinder and cone can be calculated by the formula:
1.	Volume of a cuboid (v = l*b*h), input length, breadth and height.
2.	Volume of a cylinder (v = π*r2*h), input radius and height.
3.	Volume of a cone (v = (1/3)*π*r2*h), input radius and height. 

Using a switch case statement, write a program to find the volume of different solids by taking suitable variables and data types.
For incorrect choice display appropriate message. 
*/
import java.util.Scanner;
class Program_10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ch, l, b, h, r;
        double v;
        System.out.println("**********Main Menu**********");
        System.out.println("Enter 1 for cuboid");
        System.out.println("Enter 2 for cylinder");
        System.out.println("Enter 3 for cone");
        System.out.println(".............................");
        System.out.println("Enter your choice: ");
        ch = sc.nextInt();
        switch(ch){
            case 1 :
                System.out.println("Enter length, breadth and height: ");
                l = sc.nextInt();
                b = sc.nextInt();
                h = sc.nextInt();
                v = l*b*h;
                System.out.println("Volume: "+v);
                break;
            case 2:
                System.out.println("Enter radius and height: ");
                r = sc.nextInt();
                h = sc.nextInt();
                v = 3.14*r*r*h;
                System.out.println("Volume: "+v);
                break;
            case 3:
                System.out.println("Enter radius and height: ");
                r = sc.nextInt();
                h = sc.nextInt();
                v = (1.0/3.0)*3.14*r*r*h;
                System.out.println("Volume: "+v);
                break;
            default:
                System.out.println("Invalid choice !");
        }
    }
}