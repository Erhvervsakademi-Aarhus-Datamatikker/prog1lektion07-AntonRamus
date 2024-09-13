package opgave05;

public class Opgave05 {
    public static void main(String[] args) {
        int[] myInts = {142, 12, 141, 232, 4, 5555, 21, 23, 55, 10};
        bubbleSort(myInts);
    }

    public static int[] oneBubbleSort (int [] array, int index){
        int temp1 = 0;
        int temp2 = 0;
            while (index < (array.length - 1)) {
                temp1 = array[index];
                temp2 = array[index + 1];

                if (temp1 > temp2) {
                    array[index] = temp2;
                    array[index + 1] = temp1;
                }
                index++;
            }
        return array;
    }

    public static int[] bubbleSort (int [] array){
        for (int index = array.length - 2; index >= 0; index--){
            oneBubbleSort(array,index);
        }
        return array;
    }
}
