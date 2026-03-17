package Lecture_08;



public class Lc_915_Partition_Array_into_Disjoint_Intervals {
    public static void main(String[] args) {
        int[] arr= {1,1,1,0,6,12};
       int result= partaionarray(arr);
        System.out.println(result);

    }
    public static int partaionarray(int[] arr){
        int n=arr.length;

        for (int i=0;i<=n-1;i++){
            //left arr
            int[] left=new int[i+1];
            for (int j=0;j<=i;j++){
                left[j]=arr[j];
            }
            //right arr
            int[] right=new int[n-i-1];
            int index=0;
            for(int k=n-1;k>i;k--){
                right[index]=arr[k];
                index++;
            }
            if (maximum(left)<= minimum(right)){
                return left.length;
            }
        }
        return -1;
    }
    public static int maximum(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<=arr.length-1;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }
    public static int minimum(int[] arr){
        int min=arr[0];
        for (int i=0;i<=arr.length-1;i++){
            min=Math.min(arr[i],min);
        }
        return min;
    }


}
