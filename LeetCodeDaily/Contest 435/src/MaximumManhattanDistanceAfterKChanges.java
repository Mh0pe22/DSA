public class MaximumManhattanDistanceAfterKChanges {
    public static void main(String[] args) {
        String s= "NWSE";
        int k =1;
        System.out.println(maxDistance(s , k));
    }

    public static int maxDistance(String s , int k){
        int x = 0;
        int y = 0;
        int maxDistance = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentMove = s.charAt(i);

            int bestX = x, bestY = y;
            int bestDistance = Math.abs(x) + Math.abs(y);

            for(char move : new char[]{'N' ,'S' ,'E','W'}){
                int newX = x , newY = y;
                if(move == 'N'){
                    newY++;
                } else if (move == 'S') {
                    newY--;
                } else if (move == 'E') {
                    newX++;
                }else {
                    newX--;
                }

                int currentDistance = Math.abs(newX) + Math.abs(newY);
                if(currentDistance > bestDistance){
                    bestDistance = currentDistance;
                    bestX = newX;
                    bestY = newY;
                }
            }

            if(k > 0 && bestDistance > Math.abs(x) + Math.abs(y)){
                x = bestX;
                y = bestY;
                k--;
            }else{
                if(currentMove == 'N'){
                    y++;
                } else if (currentMove == 'S') {
                    y--;
                } else if (currentMove == 'E') {
                    x++;
                }else {
                    x--;
                }
            }

            int currentDistance = Math.abs(x) + Math.abs(y);
            maxDistance = Math.max(maxDistance , currentDistance);
        }
        return maxDistance;
    }
}
