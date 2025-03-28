class Player{
    int id;
    int salary;
    String name;
    public void info(){
        System.out.println("Name of Player " +name);
        System.out.println("Player ID: " +id+"\n");
    }

}

public class prog15_OopClass {
    public static void main(String[] args) {
        
        Player isagi = new Player();    // Instantiating new Player object
        Player rin = new Player();

        // setting attributes of isagi object 
        isagi.id = 11;
        isagi.name = "Isagi Yoichi";
        isagi.salary = 14;
        isagi.info();

        rin.id = 1;
        rin.name = "Rin Itoshi";
        rin.salary = 35;
        rin.info();


    }
}
