package array.coding.practice;

public class TwoDimentionalArray {

    int arr[][] = null;
    public TwoDimentionalArray(int noOfRows, int noOfColumns){
        this.arr = new int [noOfRows][noOfColumns];
        System.out.println(" Array created noOfRows = " + noOfRows + ", noOfColumns = " + noOfColumns);


    }
    public void traverseArray(){
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[0].length; j++) {
                System.out.print(this.arr[i][j] + " ");

            }
            System.out.println();

        }
    }
    public void setMinValueInArray(){
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[0].length; j++) {
                this.arr[i][j] = Integer.MIN_VALUE;

            }

        }

    }

    public void setMaxValueInArray(){
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[0].length; j++) {
                this.arr[i][j] = Integer.MAX_VALUE;

            }

        }

    }

    public void setValueInArray(int element, int row, int col){
        try {
            this.arr[row-1][col-1] = element;
        }
        catch (Exception e){
            System.out.println("e = " + e);
        }
            
    }
    public void accessArray(int row, int col){
        try {
            System.out.println(this.arr[row][col]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("rows and columns are outside the array length");
        }
    }

    public void findElement(int element) {
        boolean isFound = false;
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[0].length; j++) {
                if (this.arr[i][j] == element){
                    System.out.println(element + " element found at row: "+ i+1 + " col: "+j+1);
                    isFound = true;
                }

            }

        }
        if (!isFound){
            System.out.println("No such element found");
        }
    }
}
