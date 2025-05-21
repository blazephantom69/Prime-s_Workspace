/*WAP to accept a number. Find and display sum, product and average of odd factor of the number. 
For example, 12: factors are 1,2,3,4,6,12.
Sum of odd factor :1+3=4
Product of odd factor: 1*3=3
Average of odd factor: 3/2=1.5
*/
import java.util.Scanner;
class Program_6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, s = 0, p = 1, c = 0;
        double avg = 0.0;
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(n%i!=0){
                s = s+i;
                p = p*i;
                c++;
            }
        }
        avg = (double)s/c;
        System.out.println("Sum of odd factors: "+s);
        System.out.println("Product of odd factors: ");
        System.out.println("Average of odd factors: "+avg);
    }
}