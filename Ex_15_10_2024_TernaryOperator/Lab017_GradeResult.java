package Oct.Ex_15_10_2024_TernaryOperator;

public class Lab017_GradeResult {
    public static void main(String[] args) {
        //Nested Ternary
        //Result = condition ? expression1 : (condition ? expression2 : expression3);
        //if the score is 90 or above grade will be "A"
        //if the score is between 80 or 89 grade will be "B"
        //if the score is between 70 or 79 grade will be "C"
        //if the score is between 60 or 69 grade will be "D"
        //if the score is below 60 grade will be "F"

      int score = 90;
       String grade = (score>=90) ? "A" : (score>80) ? "B" : (score>=70) ? "C" : (score>=60) ? "D" : "F";
       System.out.println("Your Score is -> " + grade);
       System.out.printf("Your grade is %s ", grade);

        int score1 = 50;
        String grade1 = (score1>=90) ? "A" : (score1>80) ? "B" : (score1>=70) ? "C" : (score1>=60) ? "D" : "F";
        System.out.println("\n Your Score is -> " + grade1);
    }
}
