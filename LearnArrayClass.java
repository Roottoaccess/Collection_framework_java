import java.util.Arrays;
public class LearnArrayClass {
    public static void main(String[] args) {
        
        int a[] = {1,2,5,8,18,20};

        int index = Arrays.binarySearch(a, 18);

        System.out.println("The index of element 18 in the array is: "+index);


        int num[] = {10,2,32,12,15,76,17,48};
        Arrays.sort(num);

        // Parallel sort also here


        // Arrays.fill(a,12);

        for(int i: num){
            System.out.print(i+" ");
        }
    }
}
