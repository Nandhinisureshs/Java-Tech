package Strings;
public class Stringbulider_Stringbuffer {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString());

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf.toString());
        sbf.reverse();
        System.out.println(sbf.toString());
        sbf.insert(5, "T");
        System.out.println(sbf.toString());
        sbf.delete(4,10);
        System.out.println(sbf.toString());
        sbf.replace(2,8,"Hello");
        System.out.println(sbf.toString()); //sbf-stringbuffer

        String original = "level";
        StringBuilder sb1 = new StringBuilder(original);
        System.out.println(original.equals(sb1.reverse().toString()));


    }
}