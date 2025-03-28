class employee{
    private int id;
    private float rad, area;
    private String name;
    public void setID(int x){
        this.id = x;
    }
    public int getID(){
        return id;
    }
    public void setName(String x){
        this.name = x;
    }
    public String getName(){
        return name;
    }

    // exercise

    public void setRad(float x){
        this.rad = x;
    }
    public void setArea(float x){
        area = x;
    }
    public String getArea() {
        if (area == (rad*rad)*3.14f*2) {
            return "Area is: "+area+"sq.cm";
        }
        else{
            return "Wrong area";
        }
    }
}
public class prog16_accessModifiers {
    public static void main(String[] args) {
        /*      *****Chapter - 9 : Access modifiers*****
         *          
         *              setters [mutators]  : Sets/ Updates the value
         *              getters [accessors] : Returns the value 
         */
        employee e1 = new employee();
        //e1.ID = 54;
        //e1.name = "Tobey";    ---> trows error 
        e1.setID(15);
        e1.setName("Andrew");
        System.out.println("Employee name is "+e1.getName()+" & his id is "+e1.getID());
        e1.setRad(0.5f);
        e1.setArea(1.57f);
        System.out.println(e1.getArea());
    }
}
