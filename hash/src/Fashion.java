import java.util.HashMap;
import java.util.*;
import static java.util.stream.Collectors.*;

public class Fashion {
    public int solution(String[][] clothes) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        for(String[] cloth : clothes){
            hashMap.put(cloth[1],hashMap.getOrDefault(cloth[1], 0)+1);
        }
        int answer = 1;
        for(Integer num : hashMap.values()){
            answer*=num+1;
        }
        answer -= 1;
        return answer;
    }

    public int FunctionalSolution(String[][] clothes){
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }
}
