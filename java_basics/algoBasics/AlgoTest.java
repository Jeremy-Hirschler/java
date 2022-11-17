import java.util.Arrays;
public class AlgoTest{
    public static void main(String[] args){
        Algos test = new Algos();
        // testOne.twoFiveFive();
        // int[] myArray = {1,3,12,1,2,3,43,2,3,2};
        // System.out.println(test.createY());
        // int[] arr = {2,10,3};
        // System.out.println(test.average(arr));
        // int[] arr = {1,3,5,7};
        // System.out.println(test.getLarger(arr, 3));
        // int[] arr = {1,5,10,-2};
        // System.out.println(Arrays.toString(test.square(arr)));
        int[] arr = {1,5,10,-2,4,-3};
        System.out.println(Arrays.toString(test.removeNeg(arr)));
    }


}