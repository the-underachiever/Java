public class Q1 {
    public static void main(String[] args) {
        float [] sum = {0.5f, 0.7f, 5.2f, 9.9f, 5.5f};
        float add = 0.0f;

        for (int i = 0; i < sum.length; i++) {
            add += sum[i];
        }
        System.out.println(add);
    }
}
