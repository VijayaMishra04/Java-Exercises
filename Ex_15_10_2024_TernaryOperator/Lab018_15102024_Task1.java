package Oct.Ex_15_10_2024_TernaryOperator;

public class Lab018_15102024_Task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 30;
        int largestNum = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest Number : " + largestNum);
    }
}
