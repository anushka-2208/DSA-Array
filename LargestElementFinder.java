// Find the Largest Element in an array.

public class LargestElementFinder{
    public static void main(String[] args) {
        LargestElement();
    }

    public static void LargestElement(){
        int[] arry = {2,5,8,0,1};
        int lrgst = arry[0];
        for(int i=1; i<arry.length ; i++){
            if(arry[i] > lrgst){
                lrgst = arry[i];
            }
        }
        System.out.println("The largest element is: "+ lrgst);
    }
}
