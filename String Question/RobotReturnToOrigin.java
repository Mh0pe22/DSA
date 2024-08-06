public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String robot = "LL";
        System.out.println(judgeCircle(robot));
    }

    public static boolean judgeCircle(String moves){
        int up = 0;
        int left = 0;

        for (int i = 0; i < moves.length(); i++) {
            if(moves.charAt(i) == 'U'){
                up ++;
            } else if (moves.charAt(i) == 'L') {
                left ++;
            } else if (moves.charAt(i) == 'D') {
                up--;
            } else if (moves.charAt(i) == 'R') {
                left--;
            }
        }
        return (left == 0 && up == 0);
    }
}
