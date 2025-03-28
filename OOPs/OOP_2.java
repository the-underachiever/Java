public class OOP_2 {
    public static void main(String[] args) {
        Pen p1 =  new Pen();
        Pen p2 =  new Pen("Black");
        Pen p3 =  new Pen(6);

        p1.color = "Blue";
        p1.tipSize = 8;
        p1.company[0] = "Fountain Pen";
        p1.company[1] = "Inkman Pen";
        p1.company[2] = "Teramax Pen";
        
        
        Pen p4 = new Pen(p1);
        System.out.println(p4.color);
        System.out.println(p4.tipSize);
        p1.company[2] = "Trimax Pen";       // Shallow copy and deep copy concept
        for (int i = 0; i < 3; i++) {
            System.out.println(p4.company[i]);
        }
    }
}

class Pen{
    String color;
    int tipSize;
    String company[];
    // Types of Constructors
    // 1. Non- parameterized 
    Pen() {
        company = new String [3];
        System.out.println("someone needs me.");
    }

    // 2. Parameterized
    Pen(String color){
        company = new String [3];
        this.color = color;
        System.out.println(this.color);
    }
    Pen(int x){
        company = new String [3];
        this.tipSize = x;
        System.out.println(this.tipSize);
    }

    // 3. Copy Constructor 
    // copies all properties of one obj to other    
    // Shallow Copy Constructor

    // Pen(Pen p1){
    //     company = new String [3];
    //     this.color = p1.color;
    //     this.tipSize = p1.tipSize;
    //     this.company = p1.company;
    // }

    // Deep Copy Constructor

    Pen(Pen p1){
        company = new String [3];
        this.color = p1.color;
        this.tipSize = p1.tipSize;
        for (int i = 0; i < 3; i++) {
            this.company[i] = p1.company[i];
        }
    }
}