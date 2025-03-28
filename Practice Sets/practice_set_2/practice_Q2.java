public class practice_Q2 {

    public static void main(String[] args) {
        // Encryption 
        char grade = 'B';
        char encrpyted_grade = (char)(grade + 8);  // typecasting bcz (char + int) gives (int) 
        System.out.println(encrpyted_grade);

        // Decryption 
        char decrypted_grade = (char) (encrpyted_grade - 8);
        System.out.println(decrypted_grade);

    }
}