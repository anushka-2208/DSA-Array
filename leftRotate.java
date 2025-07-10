// Left Rotate an array by one place

public class leftRotate{
    public static void main(String[] args){
        int[] arr = {20,45,67,98};
        for(int k = 0; k<arr.length; k++){System.out.print(arr[k] + ",");}
        System.err.println();
        leftR(arr);
    }
    public static void leftR(int[] nums){
        int val = nums[0];
        for(int i = 0; i<nums.length-1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length - 1] = val;
        for(int k = 0; k<nums.length; k++){System.out.print(nums[k] + " , ");}

    }
}