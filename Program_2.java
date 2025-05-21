/* Write a program to accept two number and find HCF and LCM of the number.
Ex: a=3 b=15 
Output HCF=3 and LCM = 15.
*/
import java.util.Scanner;
class Program_2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b, x, y, r, l;
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        x = Math.max(a, b);
        y = Math.min(a, b);
        while(y>0){
            r = x%y;
            x = y;
            y = r;
        }
        l = (a*b)/x;
        System.out.println("L.C.M. = "+l);
        System.out.println("H.C.F. = "+x);
    }
}

