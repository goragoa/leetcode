import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _819ytt {
    public String mostCommonWord(String paragraph, String[] banned){
        Set<String> bannedSet = new HashSet<>();
        for(String str : banned){
            bannedSet.add(str.toLowerCase());
        }

        String[] strings = paragraph.replace("!"," ")
                .replace("?"," ")
                .replace("'"," ")
                .replace(";"," ")
                .replace("."," ")
                .replace(","," ").toLowerCase()
                .split(" ");

        Map<String, Integer> map = new HashMap<String,Integer>();

        String ans = "";
        int lengthOfAns = 0;

        for(String s : strings){
            if(!s.equals("")){
                if(map.containsKey(s)){
                    map.put(s, map.get(s)+1);
                    if(map.get(s) > lengthOfAns && !bannedSet.contains(s)){
                        ans = s;
                        lengthOfAns = map.get(s);
                    }
                }
                else{
                    map.put(s , 1);
                    if(map.get(s) > lengthOfAns && !bannedSet.contains(s)){
                        ans = s;
                        lengthOfAns = map.get(s);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        _819ytt test = new _819ytt();
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[]{"hit"};

        String p1 = "Bob. hIt, baLl";
        String[] b1 = new String[]{"bob", "hit"};

        System.out.println(test.mostCommonWord(p1, b1));
    }
}

