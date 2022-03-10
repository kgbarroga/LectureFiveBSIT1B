import java.util.Scanner;

public class App {
    /**
     * Lecture Covers Topic
     * Java Methods-> basically it's a block of code that does a specific tasks
     * e.g draw circle, leveUp()
     * In Java 2 Methods 1->User Defined, Standard Library Methods(built-in)
     * Method Declaration
     * Calling a Method
     * Method Return Types
     * Parameters for methods
     * Java Constructors-> methods(special) that gets invoked when the class is initiated
     * @param args
     * @throws Exception
     */
    /**
     * Complete Syntax
     * modifier static returnType nameOfMethod (param1, param2...){
     * 
     * }
     * Using the Complete Syntax, Create a method that adds two numbers
     * and returns the sum. Note: the two numbers should come from the
     * parameters
     */
    public static void addNumbers() {
        System.out.println("Enter two numbers");
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("Sum of the: " + sum);

    }
    public int addIntegers(int x, int y){
        return x + y;
    }
    /*
     public static void main (String[] args) {
        System.out.println("Enter two numbers");
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("Sum of the: " + sum);

    }*/
    public static void main(String[] args) throws Exception {
        /**
         * Method Declaration
         * returnType methodName(){
         * 
         * }
         * eg.
         * int addNumbers(){
         *  return 0;
         * }
         * Complete Syntax
         * modifier static returnType nameOfMethod (param1, param2...){
         * 
         * }
         * static->method can be accessed without creating an object of the class.
         */
        Scanner sc = new Scanner(System.in);
        // addNumbers();
        // System.out.println(Math.sqrt(25));
        // int num1 = 100;
        // int num2 = 200;

        App newApp = new App();
        /*
        System.out.println("Enter two numbers");
        int num1, num2;
        System.out.println("Enter 1st Number");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        num2 = sc.nextInt();

        System.out.println("Sum of two numbers is: " + newApp.addIntegers(num1, num2));
        */
        /**
         * Initialize an Object from the Test Class
         */
        // Test newTest = new Test();
        // Test Test = new Test();
        
    }
}
