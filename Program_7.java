/* In an examination, the grade is awarded to the students in science according to the average marks obtained in the examination.

Average Marks	Grade
Marks>= 90	A - Excellent 
90>Marks>=80	B - Very Good
80>Marks>=70	C - Good
70>Marks>=60	D - Satisfactory
60>Marks	E - Work Hard
Write a program to input name and marks in Physics, Chemistry and Biology. Calculate the average marks. Display the name, average marks and the grade obtained.
*/
import java.util.Scanner;
class Program_7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n;
        int p, c, b, t;
        double avg;
        System.out.println("Enter your name: ");
        n = sc.nextLine();
        System.out.println("Enter marks of Physics, Chemistry and Biology: ");
        p = sc.nextInt();
        c = sc.nextInt();
        b = sc.nextInt();
        t = p+c+b;
        avg = t/3.0;
        System.out.println("******SFS REPORT CARD 2025 ********");
        System.out.println("...................................");
        
        
        System.out.println("Name            : "+n);
        System.out.println("Total marks     : "+t);
        System.out.println("Average marks   : "+avg);
        if(avg>=90)
        System.out.println("Remark          : Excellent !");
        else if(avg<90&&avg>=80)
        System.out.println("Remark          : Very good ! ");
        else if(80>avg && avg>=70)
        System.out.println("Remark          : Good ! ");
        else if(70>avg && avg>=60)
        System.out.println("Remark          : Satisfactory ! ");
        else if(avg<60)
        System.out.println("Remark          : Work hard ! ");
        System.out.println("...................................");
        
    }
}