package Medium;

import java.util.PriorityQueue;
import java.util.Queue;

public class LexicographicallySmallestStringAfterRemovingStar {
    public static void main(String[] args) {
        String s = "aaba*";
        System.out.println(clearStar(s));
    }

    public static class P{
        public char c;
        public int i;
        public P(char c , int i){
            this.c = c;
            this.i = i;
        }
    }

    public static String clearStar(String s){
        char[] str = s.toCharArray();
        Queue<P> pq = new PriorityQueue<>((a , b) ->{
            if(a.c == b.c){
                return b.i - a.i;
            }
            return Character.compare(a.c , b.c);
        });

        for (int i = 0; i < str.length; i++) {
            char c= str[i];
            if(c != '*'){
                pq.add(new P(c , i));
                continue;
            }

            if(!pq.isEmpty()){
                P q = pq.poll();
                str[q.i] = '*';
            }
        }

        char[] result = new char[str.length];
        int index = 0;
        for(char c : str){
            if(c != '*'){
                result[index++] = c;
            }
        }

        return new String(result , 0 , index);
    }
}
