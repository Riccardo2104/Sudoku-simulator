import java.io.*;
import java.util.Arrays;
public class sudoku {

    public static void main(String[] args) {
       
        // istanziamento della matrice
      int[][] arr = new int[9][9];

        //riempimento della matrice
        for (int[] r : arr)
              Arrays.fill(r, 0);
        
        
        
        // capire come funzionano questi due clicli
        for (int i = 0; i < arr.length; i++)
	    {
	    
	    for (int j = 0; j < arr[i].length; j++)
	    {
	      // here length returns number of columns corresponding to current row
		// using tabs for equal spaces, looks better aligned
		// matrix[i][j] will return each element placed at row ‘i',column 'j'
		System.out.print( arr[i][j]  + "\t");
	     }
	     System.out.println();
	   }



        // stampaggio della matrice




    }
}