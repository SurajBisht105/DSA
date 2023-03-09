package Array;

public class sort1 {
    static void sort(int array[], int length){
        int count_0 = 0;
        int i = 0;
        while(i < length){
        if(array[i]==0){
            count_0++;
        }
        i++;
        }
        int b[] = new int[length];
        for(int x = 0; x < count_0; x++){
            b[x] = 0;
        }
        for(int y = count_0; y < length; y++){
            b[y] = 1;
        }
        for(int element : b){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int array[] = {1,0,0,1,1,0,0};
        int length = array.length;
        sort(array, length);
    }
}