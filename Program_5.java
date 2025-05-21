/* Write a menu driven program using switch case statement to accept a number and perform following task
1. Check whether number is Pronic number or not. Pronic number are those number which is the product of two consecutive number. For example, 12 =3*4.
2. Check whether number is Neon number or not. Sum of digit of square of the number is equal to number itself.: For example, 9.
For incorrect choice display appropriate message.
 */
import java.util.Scanner;
class Program_5 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ch, n, i, x = 0, a, s = 0,r;
    System.out.println("Enter the number: ");
    n = sc.nextInt();
    System.out.println("Enter 1 for Pronic number and 2 for Neon number");
    System.out.println("Enter your choice: ");
    ch = sc.nextInt();
    
    switch (ch) {
        case 1:
            for(i = 1; i<=n; i++){
                if(i*(i+1)==n){
                    x = 1;
                }
            }
            if(x==1){
                System.out.println("Pronic Number ! ");
            }else{
                System.out.println("Not Pronic Number !");
            }
            break;
            case 2:
                a = n*n;
                while(a>0){
                    r = a%10;
                    s = s + r;
                    a = a / 10;
                }
                if(s==n)
                System.out.println("Neon Number! ");
                else 
                System.out.println("Not Neon Number ! ");
            break;
    
        default:
            System.out.println("Invalid choice ! ");
            break;
    }
}
    
}