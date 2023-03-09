package Array;

public class Span {
    static void difference(int arr[], int n){
        int max = arr[0];
        int min = arr[0];
        for( int i = 0 ; i < n ; i++){
            if( min > arr[i]){
                min = arr[i];
            }
            if( max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println("Span = " + (max - min));
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        difference(arr, n);
    }
}