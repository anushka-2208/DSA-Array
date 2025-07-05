// to check if the array is sorted or not

public class sortCheck{
    public static void main(String[] args){
        int[] nums = {1,3,5,6,8,90};
        int[] nums2 = {43,54,23,78,9};
        checkSort(nums);
        checkSort(nums2);
        checkSortOpti(nums);
        checkSortOpti(nums2);
    }
    public static boolean checkSort(int[] arr){
        for(int i=0; i<arr.length-2; i++){
            int prv = arr[i];
            int nxt = arr[i+1];
            if(prv>=nxt){
                System.out.println("Array is not sorted!!");
                return false;
            }
        }return true;
    }
    public static boolean checkSortOpti(int[] arry){
        for(int i = 1 ; i<arry.length; i++){
            if(arry[i-1]>arry[i]){
                return false;
            }
        }
        return true;
    }
}