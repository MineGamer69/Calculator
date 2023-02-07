import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = inp.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = inp.nextInt();
        System.out.println("Would you like to 1) Add 2) Subtract");
        int option = inp.nextInt();

        if(option == 1){
            int addSum = num1 + num2;
            System.out.println("Result = " + addSum);
        }
        if(option == 2){
            int subSum = num1 - num2;
            System.out.println("Result = " + subSum);
        }
    }
}