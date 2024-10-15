package Oct.Ex_15_10_2024_IncrementDecrement;

public class Lab007_Increment {
    public static void main(String[] args) {
        int a = 15;
        //System.out.println(a);
        System.out.println(++a);
        System.out.println(a);

        // Post Increment - Value print 1st then increase
        int post_a = 16;
        System.out.println(post_a++); //Value will not change here because incremented after
        System.out.println(post_a); // Changed value will print here
        // line no | post_a | result (post_a++)


    }
}
