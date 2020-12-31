import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question_5 {
    //List type Function
    private static List<String> rx;
    public static List<String> rmv(String s){
        rx = new ArrayList();
        checkp(s,0,0,new char[]{'(',')'});
        return rx;
    }
    private static void checkp(String s,int left,int right,char[] paran){
        int length = s.length();
        int value = 0;
        for(;right<length;right++){
            char chara = s.charAt(right);
            if(chara==paran[0]){
                value++;
            }else if(chara == paran[1]){
                value--;
            }
            if(value < 0){
                break;
            }
        }
        if(value < 0){
            for(;left<=right;left++){
                char chara = s.charAt(left);
                if(chara!=paran[1]){
                    continue;
                }
                if(left > 1 && s.charAt(left) == s.charAt(left-1)){
                    continue;
                }
                String temp = s.substring(0,left)+s.substring(left+1);
                checkp(temp,left,right,paran);
            }
        }else if (value > 0){
            checkp(new StringBuilder(s).reverse().toString(),0,0,new char[]{')','('});
        }else{
            rx.add(paran[0]=='('?s:new StringBuilder(s).reverse().toString());
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String paran  = scn.next();
        System.out.println(question_5.rmv(paran));
    }
}
