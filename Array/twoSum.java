package Array;
public class twoSum {
    static void two(int arr[], int n, int element){
        for(int i = 0; i < n-1 ; i++){
            for(int j = 0 ; j < n-1; j++){
                int sum  = arr[i]+ arr[j];
                if(sum == element){
                    System.out.println("A : " + i);
                    System.out.println("B : " + j);
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        two(arr, n, 7);
    }
}