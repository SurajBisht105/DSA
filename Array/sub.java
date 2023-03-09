package Array;

public class sub {
    static void subo(int arr1[], int arr2[]){

    }
    public static void main(String[] args) {
        int first[] = {1,2,3,4,5,6};
        int second[] = {4,5,6,2,7,9};
        int result[] = new int[first.length > second.length ? first.length : second.length];
        int i = first.length - 1;
        int j = second.length - 1;
        int k = result.length - 1;
        while(k >= 1){
            if(first[i]<second[j]){
                first[i]+=10;
                first[i-1]-=1;
                result[k]=first[i]-second[j];
            }
            else{
                result[k]=first[i]-second[j];
            }
            i--;
            j--;
            k--;
            
        }
   
        for( int element : result){
            System.out.print(element + "\t");
        }
        
    }
}