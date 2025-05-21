/* Write a program to accept any number and check whether number is Lead Number or not. A number is said to be lead number if sum of even digits of number is equal to sum of odd digits of number.
Ex: 3669,
Sum of even digit =6+6=12, Sum of odd digit =3+9=12.
*/
import java.util.Scanner;
class Program_3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, sev = 0, sod = 0, r;
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        while(n>0){
            r = n%10;
            if(r%2==0){
                sev = sev + r;
            }else{
                sod = sod+r;
            }
            n = n/10;
        }
        if(sev==sod){
            System.out.println("Lead number !");
        }else{
            System.out.println("Not lead number ! ");
        }
    }
}