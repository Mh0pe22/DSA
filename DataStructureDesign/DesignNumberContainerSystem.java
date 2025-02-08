import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DesignNumberContainerSystem {
    public static void main(String[] args) {
        DesignNumberContainerSystem ds = new DesignNumberContainerSystem();
        ds.change(1 , 10);
        System.out.println(ds.find(10));
    }

    public Map<Integer , Integer> idxToNum;
    public Map<Integer , TreeSet<Integer>> numToIdx;
    public DesignNumberContainerSystem(){
        idxToNum = new HashMap<>();
        numToIdx = new HashMap<>();
    }

    public void change(int index , int number){

        if(idxToNum.containsKey(index)){
            int prevNum = idxToNum.get(index);
            numToIdx.get(prevNum).remove(index);
            if(numToIdx.get(prevNum).isEmpty()){
                numToIdx.remove(prevNum);
            }
        }

        idxToNum.put(index , number);
        numToIdx.putIfAbsent(number , new TreeSet<>());
        numToIdx.get(number).add(index);
    }

    public int find(int number){
        if(numToIdx.containsKey(number)){
            return numToIdx.get(number).first();
        }

        return -1;
    }
}
