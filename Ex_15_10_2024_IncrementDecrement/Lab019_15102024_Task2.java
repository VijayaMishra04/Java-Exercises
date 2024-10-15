package Oct.Ex_15_10_2024_IncrementDecrement;

public class Lab019_15102024_Task2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // line no | a | result
        // ++a -> A = 11
        // a++ -> B = 11
        // a++ -> C = 12
        //A+B+C = 11+11+12 = 34
        // a = 13
    }
}
