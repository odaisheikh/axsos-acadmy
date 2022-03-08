import java.util.HashMap;

public class MabOfHash {
    
    public static void main(String[] args){
        HashMap <String,String> song = new HashMap<String , String>();
        song.put("sssss","kjhhjbj");
        song.put("jjjjj","aaaaa");
        song.put("nnnnn","kjkljkjj");
        song.put("lllll","kjhhjjhk");
        for(String x : song.keySet()){
            System.out.println("the title : "+x+"the songe is :"+song.get(x));
        }
        System.out.println(song.get("sssss"));    }
}
