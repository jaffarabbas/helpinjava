

import java.util.*;


public class strinftocharpr {
    Scanner scn = new Scanner(System.in);
    String charInString;
    char[] character;
    public strinftocharpr(){
        prepareCharacter();
    }
    public void prepareCharacter(){
        System.out.println("Enter String");
        charInString = scn.next();
        character = new char[charInString.length()];
        for(int i = 0;i<charInString.length();++i){
            character[i] = charInString.charAt(i);
        }
        int value = 0;
        //String t1 = String.valueOf(character[0]);
        String p = "";
        int a  = Integer.parseInt(String.valueOf(character[0]));
        value+=a;
        String result = p+value;
        System.out.println(result);
        value = 3;
        value+=a;
        result = p+value;
        System.out.println(result);
    }
    public static void main(String[] args) {
        strinftocharpr obj = new strinftocharpr();
    }
}
