package Array;

public class sorte {
    static void sorted(int arr[], int n){
        boolean isSorted = true;
        for(int i = 0; i < n-1; i++){
            if(arr[i]>=arr[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println("Sorted: " + isSorted);
    }
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        int n = arr.length;
        sorted(arr, n);
    }
}