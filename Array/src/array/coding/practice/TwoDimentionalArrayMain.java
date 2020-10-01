package array.coding.practice;

public class TwoDimentionalArrayMain {
    public static void main(String[] args) {
        TwoDimentionalArray ar1 = new TwoDimentionalArray(3,5);
        ar1.setMinValueInArray();
        ar1.traverseArray();
        ar1.setValueInArray(786,1,4);
        ar1.traverseArray();
        ar1.setMaxValueInArray();
        ar1.traverseArray();

    }


}