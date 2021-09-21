public class Rectangle {
    int width;
    int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    int getArea(){
        return width*height;
    }
    int getPerimeter(){
        return (width+height)*2;
    }

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(5,8);
        System.out.println("Area is " + rec1.getArea());
        System.out.println("Perimeter is " + rec1.getPerimeter());
    }
}
