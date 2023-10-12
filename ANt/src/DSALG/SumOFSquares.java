package DSALG;

public class SumOFSquares {
    public static void main(String[] args) {
        double result = SumOfExp(4);
        System.out.println("Sum of squares: " + result);
    }

    public static double SumOfExp(int n) {
        if (n == 0) {
            return 0.0;
        }
        
        int sum = n * n;
        return sum + SumOfExp(n - 1);
    }
}
