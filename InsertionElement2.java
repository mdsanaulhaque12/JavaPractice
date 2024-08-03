package arrays;

import java.io.*;

public class InsertionElement2 {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 3, 7, 9, 4};
        int[] arr2 = new int[arr.length + 1];

        System.out.println("to insert element type index and element");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index, element;
        index = Integer.parseInt(br.readLine());

        element = Integer.parseInt(br.readLine());
        int N2 = arr2.length;
        int j = 0;
        for (int i = 0; i < N2; i++) {
            if (i == index) {
                arr2[i] = element;
            } else {
                arr2[i] = arr[j];
                j++;
            }
        }
        for (int i = 0; i < N2; i++) {
            System.out.println(arr2[i]);
        }

    }
}
