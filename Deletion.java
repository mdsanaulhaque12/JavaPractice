package arrays;

public class Deletion {
    public static void main(String[] args) {
        int[] arr={1,3,7,9,4};
        int index=2;//delete index 2
        int[] arr2=new int[arr.length-1];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i==index){
                continue;
            }
            arr2[j] = arr[i];
            j++;
        }
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);
        }
    }
}
