public class prog11_ForEach {
    public static void main(String[] args) {
        int [] marks = {11,22,33,69,87};
        System.out.println(marks.length);   

        // for each loop for array traversing

        for (int i : marks) {
            System.out.println(i);
        }
    }
}
