import java.util.*;
public class PhoneNumberBook {
    public boolean solution(String[] phone_book) {
        
        boolean answer = re(Arrays.asList(phone_book));
        return !answer;
    }

    //1차시도
    private boolean re(List<String> phrList){
        Map<String,List<String>> hashMap = new HashMap<String,List<String>>();
        for(String phr : phrList){
            if(phr.length() == 1) return true;
            String start = phr.substring(0,1);
            String etc = phr.substring(1);
            List<String> value = hashMap.getOrDefault(start, new ArrayList<String>());
            value.add(etc);
            hashMap.put(start,value);
        }
        for(List<String> newPhrList : hashMap.values()){
            if(newPhrList.size()==1) continue;
            if(re(newPhrList)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(new PhoneNumberBook().solution(phone_book));
    }
}
