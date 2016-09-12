package ua.epaam;


import java.util.Arrays;

public class sortingMethods {

    public static void main(String[] args) {
        //Bubble Sort
        int newArray[] = {4, 7, 2, 9, 0, 23};
        for(int i = 1; i < newArray.length; i++)
        {
            for(int j = i; (j >= 1) && (newArray[j] < newArray[j - 1]); j--)
            {
                int a = newArray[j];
                newArray[j] = newArray[j-1];
                newArray[j-1] = a;
            }
        }
        System.out.println(Arrays.toString(newArray));
        //Selection Sort
        int array[] = {4, 9, 2, 29, 0, 13};
            for (int i = 0; i < array.length-1; i++)
            {
                int index = i;
                for (int j = i+1; j < array.length; j++)
                    if (array[j] < array[index]) //we have found the smallest value
                        index = j;
                int smallestValue = array[index];  //sorting
                array[index] = array[i];
                array[i] = smallestValue;
            }
        System.out.println(Arrays.toString(array));
        //Insertion Sort
        int c=0;
        int h=0;
        int arr[] = {4, 9, 8, 29, 0, 13, 12, 48, 85};
        int i, j, newValue;
        for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue)
            {
                c++;
                arr[j] = arr[j - 1];
                j--;
            }
            h++;
            arr[j] = newValue;
        }
        System.out.println(Arrays.toString(arr));
    }
    }

