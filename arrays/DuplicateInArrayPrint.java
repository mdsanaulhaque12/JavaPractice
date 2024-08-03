package arrays;

public class DuplicateInArrayPrint {
    public static void main(String[] args) {
        int[] arr={1,10,34,3,4,3,1,55,10,55};
        //bubble sort
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < n-1; i++) {
            if(arr[i]==arr[i+1])
                System.out.println(arr[i]);
        }

    }
}
