public class Q3 {
    public static void main(String[] args) {
        int [] marks = {55, 69, 58, 87, 100};
        float sum = 0.0f;

        for (int i : marks) {
            sum += i;
        }
        float avg = sum / marks.length;
        System.out.println("avg : "+avg);
    }
}
