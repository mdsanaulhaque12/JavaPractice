package arrays;

public class DuplicateelementInBothArray {
    public static void main(String[] args) {
        int[] arr1={1,3,5,7,4,6,14,8,9};
        int[] arr2={3,9,76,77,1,6,8};
        int n1,n2;
        if(arr1.length>arr2.length){
            n1=arr1.length;
            n2=arr2.length;
        }else{n1=arr2.length;n2=arr2.length;}
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
