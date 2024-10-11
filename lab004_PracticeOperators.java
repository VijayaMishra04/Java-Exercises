package Oct.Ex_11_10_2024;

public class lab004_PracticeOperators {
    public static void main(String[] args) {
        //___________Arithmetic Operators__________________
        int a=10,b=2;
        int c=10,d=3;
        System.out.println("___________Arithmetic Operators__________________");
        //+ (Addition): Adds two operands
        System.out.println("a+b = " + (a+b));
        //- (Subtraction): Subtracts the right operand from the left operand
        System.out.println("a-b = " + (a-b));
        //* (Multiplication): Multiplies two operands.
        System.out.println("a*b = " + (a*b));
        // / (Division): Divides the left operand by the right operand.
        System.out.println("a/b = " + (a/b));
        // % (Modulus): Returns the remainder when the left operand is divided by the right operand.
        System.out.println("a%b = " + (a%b));
        //2nd example of % (Modulus)
        System.out.println("c%d = " + (c%d));

        //______________Relational Operators________________
        int e=8,f=4;
        System.out.println("_______Relational Operators________________");
        //== (Equal to): Returns true if both operands are equal.
        System.out.println("e Equal to f = " + (e==f));
        //!= (Not equal to): Returns true if both operands are not equal.
        System.out.println(" Not equal to = " + (e!=f));
        //> (Greater than): Returns true if the left operand is greater than the right operand.
        System.out.println("e Greater than f : " + (e>f));
        //< (Less than): Returns true if the left operand is less than the right operand.
        System.out.println("e Less Than f : " + (e<f));
        //>= (Greater than or equal to): Returns true if the left operand is greater than or equal to the right operand.
        System.out.println("e Greater than or equal to : " + (e>=f));
        //<= (Less than or equal to)Returns true if the left operand is less than or equal to the right operand.
        System.out.println("Less than or equal to : " + (e<=f));

        //__________Logical Operators_______________
        boolean g=true,h=false;
        System.out.println("__________Logical Operators_______________");
        //&& (Logical AND): Returns true if both conditions are true
        System.out.println("g && h : " + (g&&h));
        //|| (Logical OR): Returns true if at least one of the conditions is true.
        System.out.println("g || h : " + (g||h));
        //! (Logical NOT): Reverse the boolean value of Conditions.
        System.out.println("g ! h :" + (!g));

        //_________Unary Operators________________________
        int i = 4;
        System.out.println("_________Unary Operators________________________");
        //+ (Unary plus): Indicates a positive value (doesn't change the value).
        System.out.println("Unary plus : " + (+i));
        //- (Unary minus): Negates the value of the operand.
        System.out.println("Unary minus : " + (-i));
        //++ (Increment): Increases the value of the operand by 1
        System.out.println("Increment : " + (++i));
        // -- (Decrement): Decreases the value of the operand by 1.
        System.out.println("Decrement : " + (--i));

        //Unary Operator Post increment and post decrement
        //a++, where the value is used first, then incremented
        System.out.println("Post Increment : " + (i++));
        //Value after post increment
        System.out.println("After post increment : " +i);
        //a--, where the value is used first, then decremented
        System.out.println("Post Decrement : " + (i--));
        //Value after post decrement
        System.out.print("After post decrement : " +i);

        //____________Assignment Operators__________
        int j=8,k=4;
        System.out.print("____________Assignment Operators__________");
        //= (Simple assignment): Assigns the value of the right operand to the left operand.
        j = k;
        System.out.println("j = k : " + j );
        //+= (Add and assign): Add the operands and assigns the result to the left operand.
        j += k; // j = j+k
        System.out.println("j += k : " + j);
        //-= (Subtract and assign):Subtract operands and assign the result to the left operand.
        j -= k; //j= j-k
        System.out.println("j -= k :" +j);
        //*=(Multiply and assign):Multiplies the operands and assigns the result to the left operand.
        j *= k; // j = j*k
        System.out.println("j *= k : " +j);
        ///= (Divide and assign): Divide operands and assign the result to the left operand.
        j /= k; // j = j/k
        System.out.print("j /= k : " +j);
        //%= (Modulus and assign): Take the modulus of the operands and assign the result to the left operand.
        j %= k; // j = j%k
        System.out.print("j %= k : " +j);

        //_________Bitwise Operators__________
        int l=4,m=2;
        System.out.print("_________Bitwise Operators__________");
        //& (Bitwise AND): Performs a bitwise AND operation. The result has a 1 only where both operands have a 1
        System.out.print("l & m : " +(l & m));
        //| (Bitwise OR): Performs a bitwise OR operation. The result has a 1 where at least one of the operands has a 1
        System.out.print("l | m : " +(l + m));
        

    }
}
