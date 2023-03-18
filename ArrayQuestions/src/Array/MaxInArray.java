package Array;

public class MaxInArray {

    public static void main(String[] args) {
	int[] arr= {20,22,50,80,60,900};
        System.out.println("max value is:- "+ maxvalue(arr));
    }
    static int maxvalue(int arr[]){
        int maxvalue= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        return maxvalue;
    }
}
