public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(2 * 5);
        varableTest("float");
    }
    public static void varableTest(String arg) {
        String name = "girae"; // "" 안쓰고 '' 쓰면 오류
        int myNum = 15;
        float myFloat = 15.5e3f; //뒤에 f 붙여야함
        char myChar = 'D'; //'' 안쓰고 "" 쓰면 오류
        boolean myBool = true;

        switch(arg) {
            case "String":
                System.out.println(name);
            break;
            case "int":
                System.out.println(myNum);
            break;
            case "float":
                System.out.println(myFloat);
            break;
            case "char":
                System.out.println(myChar);
            break;
            case "boolean":
                System.out.println(myBool);
            break;
            default:
                System.out.println("default");
            break;
        }
    }
    //Strings
    public static void StringTest() {
        String txt = "ABCEDFGH";
        txt.length(); // 길이
        txt.toUpperCase(); // 대문자
        txt.toLowerCase(); // 소문자
        String add = "ADD";
        String sum1 = txt + " " + add;
        String sum2 = txt.concat(add);
        String num = "10";
        int num2 = 20;
        String result = num + num2; //"1020"
        System.out.println(result);
    }

    public static void mathTest() {
        Math.max(5,10); // 10
        Math.min(5,10); // 5
        Math.sqrt(64); // 8
        Math.abs(-4.7); // 4.7
        Math.random(); // 0.0 <= return < 1.0
        int randomNum = (int)(Math.random() * 101); // 0 to 100
        System.out.println(randomNum);
    }

    

}
//한줄 주석
/*
여러 줄 주석
visual studio code는 저렇게 자동 별 넣어줌 안넣어도 되나?
 */
