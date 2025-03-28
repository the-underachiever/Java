import java.util.Scanner;
public class prog10_Arrays {
    public static void main(String[] args) {
        // ***** Chapter 6 : Array *****

        Scanner sc = new Scanner(System.in);
        int [] marks = new int[5];
        // dtype [] arr_name = new dtype[no of elt u want to store];

        /*
         *  1. int [] marks;         Declaration
         *     marks = new int[5];   Memory Allocation
         *      
         *  2. int [] marks = new int[5];   Declaration + Memory Allocation
         * 
         *  3. int [] marks = {11,66,69,87,45}
         */
        
        System.out.println("Enter marks of 5 students : ");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
        
        System.out.println("marks of students : ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Marks of student "+(i+1)+" is : "+marks[i]+ " \n");
        }

    }
}
