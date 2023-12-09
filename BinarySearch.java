import java.util.Scanner;


public class BinarySearch {
    int binarySearch(int array[], int key) {
        int left_index= 0;
        int right_index = array.length - 1;
        while (left_index <= right_index) {
            int middle = left_index + (right_index - left_index) / 2;

            if (array[middle] == key) {
                return middle;
            }
            if (array[middle] < key) {
                left_index = middle + 1;
            } else {
                right_index = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array \n");
        int array_size = sc.nextInt();
        int[] arr = new int[array_size];
        System.out.println("Enter elements of array \n");
        for (int i = 0; i < array_size; i++) {
            arr[i] = sc.nextInt();
        }
        int len = arr.length;
        System.out.println("Enter key to find in array \n");
        int key = sc.nextInt();
        int result = b.binarySearch(arr, key);
        if (result == -1) {
            System.out.println("Element not exist in array");
        } else {
            System.out.println("Element found at index " + result);

        }
    }
}

