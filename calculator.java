import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num1 = inp.nextFloat();
        System.out.println("Enter 2nd Number: ");
        float num2 = inp.nextFloat();
        System.out.println("Would you like to 1) Add 2) Subtract 3) Multiply 4) Divide");
        int option = inp.nextInt();

        if(option == 1){
            float addSum = (float)num1 + num2;
            System.out.println("Result = " + addSum);
        }
        if(option == 2){
            float subSum = (float)num1 - num2;
            System.out.println("Result = " + subSum);
        }
        if(option == 3){
            float multiSum = (float)num1 * num2;
            System.out.println("Result = " + multiSum);
        }
        if(option == 4){
            float divSum = (float)num1 / num2;
            System.out.println("Result = " + divSum);
        }
    }
}