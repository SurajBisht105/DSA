package Array;

public class printBar {

    static void print(int arr[], int n){
        int max = arr[0];
        for ( int i = 0 ; i < n; i++){
           if(arr[i]> max){
            max = arr[i];
           }
        }
    for(int i = max ; i > 0 ; i--){
        for(int j = 0 ;j < n ; j++){
            if( arr[i] >= arr[j]){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    }
    
    public static void main(String[] args) {
        int arr[] = {2,1,3,5,0,7};
        int n = arr.length;
        print(arr, n);
    }
}