import java.util.Arrays;
public class Sudoku {
    //TODO implementare generazione griglia
    // non so come si chiama penso campi
    int[][] arr ;
    int n;
    int m;
    int it;


    public Sudoku() {
        n = 9;
        m = 9;
        it = 1;

        // array dichiarato
        arr = new int[9][9];

        // do i valory al array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = it;
                it++;
            }
        }

    }

    public int getlenght() {
        return n;
    }

    public int getwidth(){
        return m;
    }



    @Override
    public String toString() {
        return Arrays.deepToString(arr).replace("], [", "],\n [");
    }


     static void main(String[] args) {
        Sudoku primo = new Sudoku();
        System.out.print(primo.toString());



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
