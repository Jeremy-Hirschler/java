import java.util.ArrayList;
public class Exceptions{
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add(10);
        myList.add("Value");
        myList.add("SpearBreak");
        myList.add(32);
        for (int i=0; i<myList.size(); i++){
            try {
                Integer castedValue = (Integer) myList.get(i);
            } catch (Exception e) {
                // TODO: handle exception
                // System.out.println(String.format("Error at list index %s", i));
                System.out.println(e);
                //comments
            }
        }
    }
}