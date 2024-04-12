import java.util.*;
public class PhoneNumberBook {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        int index = 0;
        for(int i=1; i< phone_book.length; i++){
            if(phone_book[i-1].length()<phone_book[i].length()){
                for(int j = index ; j < i ; j++){
                    if(phone_book[i].startsWith(phone_book[j]))return false;
                }
            } else{
                index = i;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(new PhoneNumberBook().solution(phone_book));
    }
}
