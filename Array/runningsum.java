package Array;

public class runningsum {
    static void sum(int array[], int length){
        for(int i = 1; i < length; i++ ){
            array[i]+=array[i-1];
        }
        for(int element: array){
            System.out.print(element);
        }
    }

    public static void main(String[] args) {
        int array[] = {1,0,0,1,1,0,0};
        int length = array.length;
        sum(array, length);
    }
}