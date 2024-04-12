import java.util.*;

public class Ponketmon {
    public int solution(int[] nums){
        int answer = 0;
        Set<Integer> ponketmonSet = new HashSet<Integer>();
        for(int i : nums){
            ponketmonSet.add(i);
        }

        answer = ponketmonSet.size();
        answer = answer > nums.length/2 ? nums.length/2 : answer;

        return answer;

    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(new Ponketmon().solution(nums));
    }

}
