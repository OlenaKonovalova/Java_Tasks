package ua.epaam;
import java.lang.reflect.Array;
import java.util.Arrays;


public class InvertArray {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        int temp;
        int arrayLength = Array.getLength(array);
        System.out.println("Array = " + Arrays.toString(array));
        for (int i = 0; i < arrayLength / 2; i++) {
            temp = array[i];
            array[i] = array[arrayLength - i - 1];
            array[arrayLength - i - 1] = temp;
             }

        System.out.println("InvertArray = " + Arrays.toString(array));


    }
}
