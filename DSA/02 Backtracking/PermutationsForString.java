public class PermutationsForString {
    static void findPermutations(String str, String ans){
        //base case
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        
        //recursion -> O(n*n!)

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i+1);
            findPermutations(NewStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str= "abc";
        findPermutations(str, "");
    }
}
