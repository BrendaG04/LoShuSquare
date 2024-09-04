/**
 * The Lo Shu Square: Program that accepts a two-dimensional array
 * as an argument, and determines whether the array is a Lo Shu Magic Square.
 * @since 09/00/2024
 * @author brenda Galdamez
 */


public class Main {
    public static void main(String[] args) {

    //Two Dimensional Array
        int [][] numbers= {
                {4, 9, 2},
                {3, 5, 7},
                {8, 1, 6,}
        };

    //Outputting Results
         if (LoShuCounter(numbers))
            System.out.println("It is a LO SHU MAGIC SQUARE!!!!");
         else
            System.out.println("It is not a Lo Shu Magic Square.");

    }

    //Checks Columns and rows
    public static boolean LoShuCounter(int[][] arr){
    //Total Calculators for columns (15)
      int ColumnTotal1=0,ColumnTotal2=0,ColumnTotal3=0;
    //Have to go through each row
      for (int rows=0;rows<arr.length;rows++ ){
    //Each vertical number from each row
            ColumnTotal1+=arr[rows][0];
            ColumnTotal2+=arr[rows][1];
            ColumnTotal3+=arr[rows][2];
      }
      return (ColumnTotal1==15 && ColumnTotal2==15 && ColumnTotal3==15);
    }
/*A square has all its sides the same....Another way:
    public static boolean LoShuMagicSquare(int[][] arr){
        int rowTotal1=0,rowTotal2=0,rowTotal3=0;
        for (int columns=0;columns<arr.length;columns++ ){
            rowTotal1+=arr[0][columns];
            rowTotal2+=arr[1][columns];
            rowTotal3+=arr[2][columns];
        }
        return (rowTotal1==15 && rowTotal2==15 && rowTotal3==15);
    }
*/
}