import java.util.Scanner;

public class Recursive_BinarySearch {
    int binary_Search(int array[], int start_index, int end_index, int key) {
        int midlle_index = 0;

        if (start_index <= end_index) {
            midlle_index = start_index + (end_index - start_index) / 2;

            if (array[midlle_index] == key) {
                return midlle_index;
            }

            if (array[start_index] > key) {
                return binary_Search(array, midlle_index + 1, end_index, key);
            } else {
                return binary_Search(array, start_index, midlle_index - 1, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Recursive_BinarySearch recursive_object = new Recursive_BinarySearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array.\n");
        int array_size = sc.nextInt();
        int array[] = new int[array_size];
        System.out.println("Enter elements of array: \n");
        for (int i = 0; i < array_size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter key to find in array.\n");
        int key= sc.nextInt();
        sc.close();
        int result=recursive_object.binary_Search(array,0,array_size-1,key);
        if(result==-1){
            System.out.println("Key not found in array.");
        }
        else{
            System.out.println("Key found at index: "+result);
        }
    }

}
