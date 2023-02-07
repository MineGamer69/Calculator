import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = inp.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = inp.nextInt();
        int sum = num1 + num2;
        System.out.println("Result = " + sum);



    }
}