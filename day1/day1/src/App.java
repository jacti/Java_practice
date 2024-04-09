public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(2 * 5);
        varableTest("float");
    }
    public static void varableTest(String arg) throws Exception{
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
}
//한줄 주석
/*
여러 줄 주석
visual studio code는 저렇게 자동 별 넣어줌 안넣어도 되나?
 */
