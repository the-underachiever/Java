public class prog12_multi_dim_arrays {
    public static void main(String[] args) {
        int [][] building = new int[2][4];
        building [0][0] = 101;
        building [0][1] = 102;
        building [0][2] = 103;
        building [0][3] = 104;
        building [1][0] = 201;
        building [1][1] = 202;
        building [1][2] = 203;
        building [1][3] = 204;
        // Displaying a 2-D array
        for (int i = 0; i < building.length; i++) {
            for (int j = 0; j < building[i].length; j++) {
                System.out.print(building[i][j]+" ");
            }
            System.out.println();
        }
    
    }
}
