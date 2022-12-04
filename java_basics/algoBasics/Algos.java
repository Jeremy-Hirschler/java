import java.util.ArrayList;
public class Algos{
    public void twoFiveFive(){
        for (int i=1; i<= 255; i++){
            System.out.println(i);
        }
    }


    public void odds(){
        for (int i=1; i<= 255; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public int sum(){
        int sigma = 0;
        for (int i = 0; i <= 255; i++){
            sigma += i;
        }
        return sigma;
    }

    public void arrayPrint(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public int findMax(int[] arr){
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public ArrayList<Integer> createY(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<=100; i++){
            if (i % 2 == 0){
                list.add(i);
            }
        }
        return list;
    }

    public int average(int[] array){
        int sum = 0;
        int average = 0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }

    public int getLarger(int[] arr, int num){
        int count = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > num){
                count ++;
            }
        }
        return count;
    }

    public int[] square(int[] arr){
        for (int i=0; i<arr.length; i++){
            arr[i] *= arr[i];
        }
        return arr;
    }

    public int[] removeNeg(int[] arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i] < 0){
                arr[i] = 0;
            }
        }
        return arr;
    }
    
}

//comment