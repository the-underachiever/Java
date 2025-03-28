class square{
    float side;
    public void area(float a){
        a = a*a;
        System.out.println("Area: "+a+" sq.cm");
    }
    public void perimeter(float a){
        a = 4*a;
        System.out.println("Perimeter: "+a+" cm");
    }
}
public class Q3 {
    public static void main(String[] args) {
        square s = new square();
        s.side = 5.5f;
        s.area(s.side);
        s.perimeter(s.side);
        }
}
