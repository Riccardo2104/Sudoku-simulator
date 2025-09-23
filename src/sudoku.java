import java.io.*;
//import java.util.Arrays;
import java.util.ArrayList;

public class sudoku {

    public static void main(String[] args) {
       
        // istanziamento della matrice
     // int[][] arr = new int[9][9];
        //riempimento della matrice
        /*for (int[] r : arr) {
            Arrays.fill(r, 0);
        }
        */
        /*   
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
    */ 
     
      // metodo con array list
      ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        for (int i = 1; i < 9; i++) {  // questo è per le colonne
            ArrayList<Integer> intList = new ArrayList<>(); // This creates a new list for each row.
            for (int k = 1; k < 10; k++) { // questo è per le righe
                intList.add(0);  // qui va k che rimpie le righe
            }
            mainList.add(intList);
        }
        for (int row = 0; row < mainList.size(); row++) {
            for (int col = 0; col < mainList.get(0).size(); col++) {
                System.out.print(mainList.get(row).get(col) + "\t");
            }
            System.out.println("");
        }




    }
}