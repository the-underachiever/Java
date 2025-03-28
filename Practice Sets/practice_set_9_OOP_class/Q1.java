class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String x){
        name = x;
        System.out.println("Updated name is: "+name);
    }
}
public class Q1 {
    public static void main(String[] args) {
        Employee rahul = new Employee();
        Employee ram = new Employee();

        rahul.name = "Rahul";
        rahul.salary = 15;
        System.out.println("Employee name: "+rahul.getName());
        System.out.println("Salary of Employee: "+rahul.getSalary());
        rahul.setName("Rahul Pandit");
        System.out.println("");

        ram.name = "Ram";
        ram.salary = 88;
        System.out.println("Employee name: "+ram.getName());
        System.out.println("Salary of Employee: "+ram.getSalary());
        //ram.setName("Ram Yadav");
        System.out.println("");

    }

}
