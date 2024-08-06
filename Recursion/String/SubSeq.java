package String;

import java.util.ArrayList;

public class SubSeq {

    public static void main(String[] args) {

        String a = "abc";
        subseq("" , a);
//        System.out.println(subseqRet("" , a));
    }


    static void subseq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        subseq( p + up.charAt(0) , up.substring(1));
        subseq(p , up.substring(1));
    }

    static ArrayList<String> subseqRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }

        ArrayList<String> left = subseqRet( p + up.charAt(0) , up.substring(1));
        ArrayList<String> right = subseqRet(p , up.substring(1));

        left.addAll(right);
        return left;
    }


}
