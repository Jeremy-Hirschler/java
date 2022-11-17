public class FizzbuzzTest{
    public static void main(String[] args){
        Fizzbuzz number = new Fizzbuzz();
        // System.out.println(number.getNum(35));
        // System.out.println(number.getNum(31));
        // System.out.println(number.getNum(30));
        // System.out.println(number.getNum(9));
        for (int i=0; i <= 100; i++){
            System.out.println(number.getNum(i));
        }
    }
}