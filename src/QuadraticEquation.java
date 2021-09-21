import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    double getDiscriminant() {
        return b*b - 4 * a * c;
    }

    double getRoot1() {

        return (-b + Math.sqrt(b*b - 4 * a * c)) / a * 2;
    }

    double getRoot2() {

        return (-b - Math.sqrt(b*b - 4 * a * c))/ a * 2;
    }
    double getRoot(){

        return -b/2*a;
    }



    public static void main(String[] args) {
       double a;
       double b;
       double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap he so a, b, c");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        QuadraticEquation equation1 = new QuadraticEquation(a, b, c);
        double d = equation1.getDiscriminant();
        if (d < 0) {
            System.out.println("Pt vo nghiem");

        } else if (d == 0) {
            System.out.println("Pt co nghiem kep " + equation1.getRoot());
        } else
            System.out.println("Pt co 2 nghiem la " + equation1.getRoot1() + " va " + equation1.getRoot2());
    }
}
