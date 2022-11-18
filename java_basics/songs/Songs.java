import java.util.HashMap;
import java.util.Set;
public class Songs{
    public static void addSongs(){
        HashMap<String, String> songList = new HashMap<String, String>();
        songList.put("1", "Surrender My Heart");
        songList.put("2", "Anti-Hero");
        songList.put("3", "Bad Thing Twice");
        songList.put("4", "Bejeweled");
        String song = songList.get("2");
        System.out.println(song);
        Set<String> keyList = songList.keySet();
        for (String key: keyList){
            System.out.println("Track: " + songList.get(key));
        }
        
    }

}