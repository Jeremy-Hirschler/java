import java.util.Random;
import java.util.ArrayList;
public class Puzzle{
    public ArrayList<Integer> getRandom(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random num = new Random();
        for (int i=1; i<=10; i++){
            list.add(num.nextInt(20) + 1);
        }
        return list;
    }
}