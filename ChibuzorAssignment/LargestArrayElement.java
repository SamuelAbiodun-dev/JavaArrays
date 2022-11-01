package ChibuzorAssignment;

public class LargestArrayElement {
    public  static int getLargestElement(int[] array, int total){
        int temporal;
        for(int index1 = 0; index1 < total; index1++){
            for(int index2 = index1 + 1; index2 < total; index2++){
                if(array[index1] > array[index2]){
                    temporal = array[index1];
                    array[index1] = array[index2];
                    array[index2] = temporal;
                }
            }
        }
        return array[total - 1];
    }
}
