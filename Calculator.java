import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("\nCalculator\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();


        menudisplay();
        
        String cstring = input.next();

        char choice = cstring.charAt(0);


        if (choice == '1'){
            addition(num1, num2);
        }

        if (choice == '2'){
            subtraction(num1, num2);
        }

        if (choice == '3'){
            multiplication(num1, num2);
    
        }

        if (choice == '4'){
            division(num1, num2);
        }        

        input.close();
    }

    public static void menudisplay(){
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiply");
        System.out.println("4. Integer Division\n");
        
    }


    public static void addition (int num1, int num2){
        System.out.println("Performing Addition: \n");

        int add = num1 + num2;
        System.out.printf("The Addition of %d and %d is: %d \n", num1, num2, add);
        
    }

    public static void subtraction (int num1, int num2){
        System.out.println("Performing Subtraction: \n");

        int sub = num1-num2;
        System.out.printf("The Subtraction of %d and %d is: %d \n", num1, num2, sub);

    }

    public static void multiplication(int num1, int num2){
        System.out.println("Perfroming Multiplication: \n");

        int mul = num1 * num2;
        System.out.printf("The Multiplication of %d and %d is: %d \n", num1, num2, mul);
        

    }

    public static void division(int num1, int num2){

        if(num2 == 0){
            System.out.println(" Error! Numerator must be grater than zero");
        }
        
        else{

            System.out.println("Performing Integer Division: \n");

            int div = num1 / num2;
            System.out.printf("The Integer Division of %d and %d is: %d \n", num1, num2, div);
        }
            

        
        
    }
}
