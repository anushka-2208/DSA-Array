import java.util.Arrays;

public class SecondLargestElement{
    public static void main(String[] args){
        int[] arry = {10,34,23,45,76,98,98,98,10};
        int[] arry2 = {-10, -5, -2, -30};
        int[] arry3 = {7, 7, 7, 7};
        int[] arry4 = {5};
        int[] arry5 = {10, 10};
        int[] arry6 = {Integer.MIN_VALUE, -1, -100};
        SLEun(arry4);
        SLEun2(arry4);
    }
    // If the array is sorted, then I know that the last element is the largest element which is N-1
    // public static void SLEsorted(int[] nums){
    //     nums = {1,2,3,4,5};
    //     int largest = nums[n-1];
    //     for(int i = n-1; i>0; i--){
    //         if(nums[i]=largest){

    //         }
    //     }

    // }
    public static void SLEun(int[] nums){
        int largest = nums[0];
        for(int i=1; i< nums.length; i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }
        int SecondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<largest && nums[i]>SecondLargest){
                SecondLargest = nums[i];
            }
        }
        if(SecondLargest == Integer.MIN_VALUE){
            System.out.println("Second Largest Element not found!!");
        }
        else{
            System.out.println("Second Largest Element is " + SecondLargest);
        }
        // first loop - O(n)
        // second loop - O(n)
        // O(n)+O(n) = O(n)
    }

    public static void SLEun2(int[] nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i]> secondLargest && nums[i]<largest){
                secondLargest = nums[i];
            }
        }
        if(largest == Integer.MIN_VALUE ){
            System.out.println("No largest or second largest number founs!!");
        }
        else{
            System.out.println("The largest element is: "+ largest + " and the second largest is: "+ secondLargest);
        }
    }
}   
// One exceptional case can be when there is a Less than two elements in an array.
// Before looping, check: if (arr.length < 2) → Print or return a special value or error message.

// There's only single value repeating multiple times in an area. Then we will not having any second largest element.

// arrays can hold negative values as well. That's why we're assigning minimum value to both