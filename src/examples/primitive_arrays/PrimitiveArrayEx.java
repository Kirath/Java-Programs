package examples.primitive_arrays;

public class PrimitiveArrayEx {
    public static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4};
        int [] b = {8, 9};
//        a = b;
        b = a;
        printArray(b);
        int arr[][] = new int[3][];
        for(int i = 0; i< arr.length;i++){
            arr[i] = new int[3];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
