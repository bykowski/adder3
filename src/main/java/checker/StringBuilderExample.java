package checker;

public class StringBuilderExample {


    static StringBuilder stringBuilder = new StringBuilder();
    static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) {

        long startBuilder = System.currentTimeMillis();
        for (int i = 0; i < 9999999 ; i++) {
            stringBuilder.append("Hello");
        }
        stringBuilder.toString();

        System.out.println(System.currentTimeMillis() - startBuilder);

        long startBuffer = System.currentTimeMillis();
        for (int i = 0; i < 9999999 ; i++) {
            stringBuffer.append("Hello");
        }
        stringBuffer.toString();
        System.out.println(System.currentTimeMillis() - startBuffer);






    }






}
