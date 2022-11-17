import java.util.Date;
public class Bot{
    public String basicGreeting(){
        return "Hello. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod){
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String dateAnnouncement(){
        Date date = new Date();
        return "The time is: " + date;
    }

    public String beforeAlexis(String conversation){
        int isSheThere = conversation.indexOf("Alexis");
        int isHeThere = conversation.indexOf("Alfred");
        if (isSheThere != -1){
            return "Alexis is here, quiet.";
        }else if(isHeThere != -1){
            return "The king is here.";
        }else{
            return "No one to be found..";
        }
    }
}