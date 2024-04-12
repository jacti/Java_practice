import java.util.*;

public class Maraton {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> participantMap = new HashMap<String,Integer>();
        for(String person : participant){
            if(participantMap.containsKey(person)){
                int value = participantMap.get(person);
                participantMap.replace(person, value+1);
            }
            else{
                participantMap.put(person, 1);
            }
        }

        for(String person : completion){
            int value = participantMap.get(person);
            if(value == 1){
                participantMap.remove(person);
            } else{
                participantMap.replace(person, value-1);
            }
        }
        String answer = participantMap.keySet().iterator().next();
        return answer;
    }

    public String perfectSolution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        //getOrDefault 를 사용해서 깔끔하게 표현
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(new Maraton().solution(participant, completion));
    }

}
