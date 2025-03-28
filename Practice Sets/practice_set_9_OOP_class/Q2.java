class cellPhone{
    public void silentMode(){
        System.out.println("not ringing...");
    }
    public void vibratingMode(){
        System.out.println("vibrating...");
    }
    public void ringingMode(){
        System.out.println("ringing...");
    }
}
public class Q2 {
    public static void main(String[] args) {
        cellPhone realme = new cellPhone();
        System.out.print("Achyut's phone is ");
        realme.silentMode();
        
        cellPhone nothing = new cellPhone();
        System.out.print("Fizzu's phone is ");
        nothing.vibratingMode();

        cellPhone iqoo = new cellPhone();
        System.out.print("Kartik's phone is ");
        iqoo.ringingMode();
    }
}
