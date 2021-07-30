package ch7;
import java.util.Scanner;
public class Ch7_25 {

    public static void main(String[] args){
        double[] eqn = new double[3];
        double[] roots = new double[2];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic equation aX^2 +bX + c = 0.");
        System.out.print("enter the values of a, b, and c separated by a space: ");
        eqn[0] = input.nextDouble();
        eqn[1] = input.nextDouble();
        eqn[2] = input.nextDouble();

        int noOfRoots = solveQuadratic(eqn, roots);

        if(noOfRoots == 0)
            System.out.println("The equation has no solution.");
        else if(noOfRoots == 1){
            System.out.println("The equation has 1 root: " + roots[0]);
        }
        else {
            System.out.println("The equation has 2 roots: " + roots[0] + " and " + roots[1]);
        }



    }
    public static int solveQuadratic(double[] eqn, double[] roots){
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double determinant = b * b - 4 * a * c;
        if(determinant < 0)
            return 0;
        if (determinant == 0){
            double x = -b / (2 * a);
            roots[0] = x;
            return 1;
        }
        else {
            double determinantRoot = Math.sqrt(determinant);
            double x1 = (-b - determinantRoot) / (2 * a);
            double x2 = (-b + determinantRoot) / (2 * a);

            roots[0] = x1;
            roots[1] = x2;

            return 2;
        }
    }
}
