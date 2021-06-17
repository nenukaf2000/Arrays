import java.util.Collections;

public class getMax {
    public static void main(String[] args) {

        //**********   Array in reverse    *************//

        int[] numbers = {1, 2, 3, 4, 5};
        int n = numbers.length;

        int temp;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;

        }

        System.out.println("Array in reverse");
        for (int j = 0; j < n; j++) {
            System.out.print(numbers[j]);
        }


    }
}



