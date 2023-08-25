import java.util.Scanner;

public class DescendingOrder {
    // TODO: Write a void method selectionSortDescendTrace() that takes
    //       an integer array and the number of elements in the array as arguments,
    //       and sorts the array into descending order.
    public static void selectionSortDescendTrace(int [] numbers, int numElements) {
        for(int i = 0; i < numElements - 1; i++){
            int max = numbers[i];
            int maxIndex = i;
            for(int j = i + 1; j < numElements; j++){
                if(numbers[j] > max){
                    max = numbers[j];
                    maxIndex = j;
                }
            }
            swap(numbers, i, maxIndex);
            System.out.println(toString(numbers));
        }
    }

    public static String toString(int[] numbers){
        String string = "";
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] != 0){
                string += numbers[i] + " ";
            }
        }
        return string;
    }

    public static void swap(int[] numbers, int a, int b){
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int input;
        int numElements = 0;
        int[] numbers = new int[10];

        // TODO: Read in a list of up to 10 positive integers; stop when
        //       -1 is read. Then call selectionSortDescendTrace() method.
        for(int i = 0; i < numbers.length; i++) {

            input = scnr.nextInt();

            if (input == -1) {
                    selectionSortDescendTrace(numbers, numElements);
            } else{
                numbers[i] = input;
                numElements++;

                if(numElements == 10){
                        selectionSortDescendTrace(numbers, numElements);
                }
            }
        }
    }
}