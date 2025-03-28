class rect{
    float length;
    float breadth;
    public void area(float a ,float b){
        a = a*b;
        System.out.println("Area: "+a+" cm square");
    }
    public void perimeter(float a, float b){
        a = 2*(a+b);
        System.out.println("Perimeter: "+a+" cm square");
    }
}
public class Q4 {
    public static void main(String[] args) {
        rect x = new rect();
        x.length = 7.0f;
        x.breadth = 5.9f;
        x.area(x.length,x.breadth);
        x.perimeter(x.length, x.breadth);
    }
}
