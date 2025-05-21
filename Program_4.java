/* Write a program to accept a number and display largest digit of the number. Also display square and cube of largest number. 
For example, 5824.
Output: 8 is largest digit 
Square:8*8 =64
Cube: 8*8*8=512.
*/
import java.util.Scanner;
class Program_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r, max = 0 ;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        while (n>0) {
            r = n % 10;
            max = Math.max(max, r);
            n = n/10;
        }
        System.out.println("Largest digit: "+max);
        System.out.println("Square: "+(max*max));
        System.out.println("Cube: "+(max*max*max));
    }
}