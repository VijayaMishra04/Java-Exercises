package Oct.Ex_14_10_2024;

public class Lab005_TypeCasting {
    public static void main(String[] args) {
        //__________Implicit Type Casting___________
        //The compiler automatically converts one datatype to another
        int num = 100; //Integer Value
        double d = num; //Implicit casting from int to double
        System.out.print("Implicit casting from int to double : " + d);

        //_________Explicit Type Casting_______________
        //You need to manually convert one data type to another by using Explicit Type casting
        double deci = 9.78; //Double value
        int decimal = (int)deci; //Explicit Casting from double to int
        System.out.print("\nExplicit Casting from double to int : " + decimal);

        //Real Time Examples for TypeCasting
        // Example - Type Casting in banking Application
        //In banking systems, interest is often calculated using floating-point numbers
        double interest = 105.75; //Interest amount as a double
        int roundedInterest = (int) interest; // Explicit casting double to int (rounded down)
        System.out.print("Interest Amount : " + roundedInterest);
    }
}
