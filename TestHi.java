// Introductory class

// Every java program must start with a class
// This class prints "Hello World"
public class TestHi {

    /*
     * Visibility Modifier (public/private): determines if classes outside the program can access
     * the method or variable
     * 
     * Static: ensures the method can be used without having to initialize the object
     * 
     * Return value (void, int, double, boolean): determines the data returned in the method
            * Void - method returns no value
            * int - method returns an integer value
            * double - method returns a decimal value
            * boolean - method returns true or false value
     * Parameter list (in the paraenthesis): holds a list of variables that a method can take when called
            * We do not need to know what "String[] arg" is
            * i dont even really know what it is but an array I guess???
            * Parameter lists usually looks like (int num, String name, double price, boolean state)
     * 
     */

    // returns sum of two numbers
    public static int addNum(int a, int b){

        int sum = a + b;
        return sum;

    }

    // prints out Hello World
    public static void sayHi(){
        System.out.println("Hello World!");
    }

    /*
    * We will NOT be using main method when programming our robot, but it is useful to know that
    * main method allows us to run the code in an application
    */
    public static void main(String[] arg){
        sayHi();
        System.out.println(addNum(3, 5));
    }
}
