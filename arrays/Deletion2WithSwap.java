package arrays;

public class Deletion2WithSwap {
    public static void main(String[] args) {
        int index =3;
        int j=index;
        int[] arr={1,3,5,6,7,2,54};
        int n=arr.length;
        for(int i=0;i<n-index-1;i++){
            arr[j]=arr[j+1];
            j++;
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }
}
