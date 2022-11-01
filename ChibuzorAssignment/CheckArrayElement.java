package ChibuzorAssignment;

public class CheckArrayElement {
   public static int checkElement(int[] array, int value) {
      int index;
       for (index = 0; index < array.length; index++) {
           if (array[index] == value) {
                return index;
           }
       }
       return  -1;
   }

}
