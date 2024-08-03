package arrays;

import java.io.*;
import java.nio.Buffer;

public class InsertionElement {
    public static void main(String[] args)throws IOException {
        int[] arr = {1,3,7,9,4};
        //insert element 4 at index 3
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input index number and element to insert");
        int index = Integer.parseInt(br.readLine());
        int element=Integer.parseInt(br.readLine());
        int N = arr.length;

        for (int i = N - 1; i >0; i--) {
            if (i == index) {
                arr[index] = element;
                break;
            }
            arr[i] = arr[i - 1];
        }

        for (int ar : arr)
        {
            System.out.println(ar);
        }

    }
}
