public class MyProgram{
    public static void main(String[] args){
        // Print

        // Print String
        System.out.print("Testing broh ");
        System.out.println("Hello World");


        // Print Number
        System.out.println(123);
        System.out.println(123 + 100);

        // Single Line Comment
        System.out.println("Single Line Comment");
        System.out.println("Single Line Comment after this"); // Single Line Comment

        // Multi Line Comment
        System.out.println("Multi Line Comment");
        /* Multi Line Comment
            System.out.println("This is Multi Line Comment") 
         */

        // Variable
        System.out.println("-------------------------------");
        System.out.println("VARIABLE SECTION");
        System.out.println("-------------------------------");

        // String
        String firstName = "Eka ";
        System.out.println(firstName);

        // Integer
        int firstNumber = 20;
        System.out.println(firstNumber);

        String lastName = "Nata"; 
        int secondNumber = 30;

        // Print Multiple Variable
        System.out.println(firstName + lastName);
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstName + firstNumber);

        // Multiple Variables
        int thirdNumber = 40, fourthNumber = 50, fifthNumber = 60;
        System.out.println(thirdNumber + fourthNumber + fifthNumber);

        // Multiple Variables with same value and type
        int x, y, z;
        x = y = z = 100; 
        System.out.println(x + y + z);

        // Casting
        System.out.println("-------------------------------");
        System.out.println("Wide Casting");
        System.out.println("-------------------------------");

        int myInt = 9;
        double myDouble = myInt; // Casting int t double

        System.out.println(myDouble);

        System.out.println("-------------------------------");
        System.out.println("Narrow Casting");
        System.out.println("-------------------------------");

        double mySecondDouble = 9.78d;
        int mySecondInt = (int) mySecondDouble; // Casting double to int;

        System.out.println(mySecondInt);

        System.out.println("-------------------------------");
        System.out.println("Array");
        System.out.println("-------------------------------");

        // Array
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};

        System.out.println("For Loop");
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
        System.out.println("-----------------------");
        System.out.println("Foreach Loop");

        for(String item : fruits){
            System.out.println(item);
        }


    }
}