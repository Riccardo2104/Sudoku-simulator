import java.util.Arrays;
public class Sudoku {
    //TODO implementare generazione griglia
    // non so come si chiama penso campi
    private int[][] arr  ;
    private  int lunghezza = 9;
    private  int larghezza = 9;

    public Sudoku() {
        arr = new int[lunghezza][lunghezza];
        for (int[] r : arr)
            Arrays.fill(r, 0);


    }

    // arralist numeri da uno 1 a 9

   /*
    ArrayList<Integer> numeri = new ArrayList<Integer>(); // Create an ArrayList object



    for (int i = 0; i==numeri; i++) {
        System.out.println(i);
    }

*/


    public static void main(String[] args) {
        Sudoku primo = new Sudoku();
        System.out.print(primo);

    }
    /*
    public sudoku(int[][] arr) {
        for (int[] r : arr)
            Arrays.fill(r, 0);

    }*/
    /*
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
        */




}
