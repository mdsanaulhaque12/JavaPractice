package arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,4,15,6,1,8,7};
        int N= arr.length;
        int k=1;//if want 2nd biggest number qwe will run loop iteration only for two times by using if condition
        for(int i=0;i<N-1;i++){
            if(i==k)break;
            for (int j=0;j<N-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int a:arr
             ) {
            System.out.println(a);
        }

    }
}
