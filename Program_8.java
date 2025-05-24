/* Write a menu driven program using switch case statement to accept a number and perform following task.
1. To input a number and display sum of Even digit of the number 
2. To display the factorial of the number input by the user. For example, factorial of 5 = 5*4*3*2*1 = 120.
For incorrect choice display appropriate message.
*/
import java.util.Scanner;
class Program_8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, ch, r, s= 0, i;
        long f = 1;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        System.out.println("--------------------------Main menu-----------------------");
        //System.out.println("*****");
        System.out.println("1 to display sum of even digits ");
        System.out.println("2 To display the factorial. ");
        
        System.out.println("...............................");
        System.out.print("Enter your choice: ");
        ch = sc.nextInt();
        
        switch(ch){
            case 1:
                while(n>0){
                    r = n%10;
                    if(r%2==0)
                    s = s+ r;
                    n = n/10;
                }
                System.out.println("Sum of even digits: "+s);
                
                break;
            case 2:
               for(i=1; i<=n;i++){
                   f = f*i;
                   
               }System.out.println("Factorial: "+f);
                break;
            default:
                
            }
        
    }
}

