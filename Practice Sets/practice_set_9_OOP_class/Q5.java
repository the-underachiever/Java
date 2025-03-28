class bgmi{
    public void enterVehicle(){
        System.out.println("Entered  vehicle");
    }
    public void pick(){
        System.out.println("Picked up the gun");
    }
    public void throwGrenade(){
        System.out.println("Throw the grenade");
    }
    public void rush(){
        System.out.println("Rush on the enemies");
    }
}
public class Q5 {
    public static void main(String[] args) {
        bgmi player1 = new bgmi();
        player1.enterVehicle();
        player1.pick();
        player1.throwGrenade();
        player1.rush();
    }
}
