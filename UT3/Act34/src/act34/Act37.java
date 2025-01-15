package act34;

public class Act37 {
    public static void main(String[] args){
        int[][] matrix = new int[3][6];
    
        matrix[0][0] = 0;
        matrix[0][1] = 30;
        matrix[0][2] = 2;
        matrix[0][5] = 5;
        
        matrix[1][0] = 75;
        matrix[1][4] = 0;
        
        matrix[2][2] = -2;
        matrix[2][3] = 9;
        matrix[2][5] = 11;
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == null){
                    System.out.print("  ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
