import java.util.*;

public class CalendarExam{
    public String hundredDaysAfter(){
        //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
        Calendar hundredAfter = Calendar.getInstance();
        hundredAfter.add(Calendar.DATE,100);
        
        return new StringBuffer()
        .append(hundredAfter.get(Calendar.YEAR)).append("년")
        .append(hundredAfter.get(Calendar.MONTH)).append("월")
        .append(hundredAfter.get(Calendar.DATE)).append("일")
        .toString();
        
    }
    public static void main(String[] args){
        System.out.println(new CalendarExam().hundredDaysAfter());
    }
}