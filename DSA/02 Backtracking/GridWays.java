public class GridWays {
    public static int FindGrid(int i, int j, int n, int m){
        //base-case
        if (i == n-1 && j == m-1) { //last cell condition
            return 1;
        }
        else if(i == n || j == n){  //boundary condition
            return 0;
        }
        //choices
        int w1 = FindGrid(i+1, j, n, m);    //row first
        int w2 = FindGrid(i, j+1, n, m);    //col first
        return w1+w2;
    }
    public static void main(String[] args) {
        int n = 3, m =3;
        System.out.println(FindGrid(0, 0, n, m));
    }
}
