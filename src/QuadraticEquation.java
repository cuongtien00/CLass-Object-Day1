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
        return Math.pow(b, 2) - 4 * a * c;
    }

    double getRoot1() {

        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / a * 2;
    }

    double getRoot2() {

        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/ a * 2;
    }
    double getRoot(){

        return -b/2*a;
    }



    public static void main(String[] args) {
        QuadraticEquation equation1 = new QuadraticEquation(3, 2, -2 );
        double d = equation1.getDiscriminant();
        if (d > 0) {
            System.out.println("Pt co 2 nghiem la " + equation1.getRoot1() + " va " + equation1.getRoot2());
        } else if (d == 0) {
            System.out.println("Pt co nghiem kep " + equation1.getRoot());
        } else
            System.out.println("Pt vo nghiem");
    }
}
