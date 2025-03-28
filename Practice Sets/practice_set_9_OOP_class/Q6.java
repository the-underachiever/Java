class circle{
    float rad;
    public void area(float r){
        r = 3.14f * r * r;
        System.out.println("Area: "+r+" sq.cm");
    }
    public void perimeter(float r){
        r = 3.14f * 2.0f * r;
        System.out.println("Area: "+r+" cm");
    }
}
public class Q6 {
    public static void main(String[] args) {
        circle c = new circle();
        c.rad = 5.6f;
        c.area(c.rad);
        c.perimeter(c.rad);
    }
}
