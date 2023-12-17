package week07_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice1 {
    public static void main(String[] args) {

        // int[] arr= {1, 2, 3}; // new int[3] {1, 2, 3}
        int[] arr = new int[3];

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        // arr[4] = 500;

        System.out.println(Arrays.toString(arr));

        int[] arr2 = {10, 20, 30};

        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            arr[i] *= 10;
            // System.out.println(arr[i] * 10);
        }

        System.out.println(Arrays.toString(arr));

        // Scanner input = new Scanner(System.in);

        String[] names = new String[5]; // 0 ~ 4

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter a name:");
            names[i] = new Scanner(System.in).nextLine();
        }

        //input = null;
        System.out.println(Arrays.toString(names));


    }
}

/*



Data Structure: to use data efficiently

Java Data Structures:
	1. Array
	2. Collection
	3. Map


Array: Size is fixed. Supports both primitives & non-primitives. Can be multi-dimensional

	Single dimensional: to store elements

	Multi dimensional: to store arrays



Practice Tasks:
Create a class named Item with the following requirements:
@@ -28,4 +43,11 @@ Create a class named ShoppingCart and write a program with the following require

	Actions:
		addItem(Item): adds the given item to the shopping cart as long as there are fewer than 10 items in the cart.
		displayCart(): displays the name, unit price, and quantity of each item and the total cost.
		displayCart(): displays the name, unit price, and quantity of each item and the total cost.



* */