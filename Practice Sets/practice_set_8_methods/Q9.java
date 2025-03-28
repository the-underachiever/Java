public class Q9 {
    static float celciusToFahrenheit(float x){
        return ((9*x+160)/5);
    }

    public static void main(String[] args) {
        float tempInFahrenheite = celciusToFahrenheit(39.8f);
        System.err.println(tempInFahrenheite);
    }
}
