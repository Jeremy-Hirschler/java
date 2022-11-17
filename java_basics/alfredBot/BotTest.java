public class BotTest{
    public static void main(String[] args){
        Bot quotes = new Bot();
        String testGreeting = quotes.basicGreeting();
        String personGreeting = quotes.guestGreeting("Jill Pill", "Morning");
        String sayDate = quotes.dateAnnouncement();
        String converse1 = quotes.beforeAlexis("Alexis is better");
        String converse2 = quotes.beforeAlexis("Alred is better than Alfred");
        String converse3 = quotes.beforeAlexis("I like shorts.");
        // System.out.println(testGreeting);
        // System.out.println(personGreeting);
        // System.out.println(sayDate);
        System.out.println(converse1);
        System.out.println(converse2);
        System.out.println(converse3);
    }
}