/*Write a program to accept a number and check and display whether the number is Dudeyney number or not.*/
import java.util.Scanner;
class Program_9{
    public static void main(String args[]){
        int n, a, r, s = 0, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        a = n;
        while(a>0){
            r = a%10;
            s = s+r;
            a = a/10;
        }
        c = s*s*s;
        if(c == n){
            System.out.println("Dudeyney number !");
        }else{
            System.out.println("Not dudeyney number !");
        }
    }
}