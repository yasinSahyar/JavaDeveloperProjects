package utility;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length + arr2.length];// to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0;

        for (int i = 0; i < arr1.length; i++,k++) {//i: for first array's index numbers
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++,k++) {//i: for second array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;

    }


    public static double[] merge(double[] arr1, double[] arr2){

        double[] arr3 = new double[arr1.length + arr2.length];// to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0;

        for (int i = 0; i < arr1.length; i++,k++) {//i: for first array's index numbers
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++,k++) {//i: for second array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;

    }

    public static char[] merge(char[] arr1, char[] arr2){

        char[] arr3 = new char[arr1.length + arr2.length];// to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0;

        for (int i = 0; i < arr1.length; i++,k++) {//i: for first array's index numbers
            arr3[k] = arr1[i];

        }

        for (int i = 0; i < arr2.length; i++,k++) {//i: for second array's index numbers
            arr3[k] = arr2[i];
        }
        return arr3;

    }
}
