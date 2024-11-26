public class FindChampion2 {
    public static void main(String[] args) {

    }

    public static int findChampion(int n, int[][] edges){

        int[] inDegree = new int[n];

        for(int[] i : edges){
            int u = i[0];
            int v = i[1];

            inDegree[v]++;
        }

        int count = 0;
        int champ = -1;

        for (int i = 0; i < inDegree.length; i++) {
            if(inDegree[i] == 0){
                champ = inDegree[i];
                count++;
            }

            if(count > 1){
                return -1;
            }
        }

        return champ;
    }
}
