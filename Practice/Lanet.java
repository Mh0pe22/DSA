public class Lanet {
    public static void main(String[] args) {
        String s = "2? + 34 = 5?";
        System.out.println(MissingDigits(s));
    }

    private static String MissingDigits(String str){
        String[] parts = str.split(" ");
        String left = parts[0];
        char op = parts[1].charAt(0);
        String right = parts[2];
        String result = parts[4];

        // Find missing positions
        Integer leftQ = left.indexOf('?') != -1 ? left.indexOf('?') : null;
        Integer rightQ = right.indexOf('?') != -1 ? right.indexOf('?') : null;
        Integer resQ = result.indexOf('?') != -1 ? result.indexOf('?') : null;

        // Try all combinations of digits for each question mark
        for (int d1 = 0; d1 <= 9; d1++) {
            String leftCandidate = left;
            if (leftQ != null) {
                if (d1 == 0 && left.length() > 1 && leftQ == 0) continue; // skip leading zero
                leftCandidate = left.replace('?', (char)('0' + d1));
            }
            for (int d2 = 0; d2 <= 9; d2++) {
                String rightCandidate = right;
                if (rightQ != null) {
                    if (d2 == 0 && right.length() > 1 && rightQ == 0) continue;
                    rightCandidate = right.replace('?', (char)('0' + d2));
                }
                for (int d3 = 0; d3 <= 9; d3++) {
                    String resCandidate = result;
                    if (resQ != null) {
                        if (d3 == 0 && result.length() > 1 && resQ == 0) continue;
                        resCandidate = result.replace('?', (char)('0' + d3));
                    }
                    try {
                        int lval = Integer.parseInt(leftCandidate);
                        int rval = Integer.parseInt(rightCandidate);
                        int eval = Integer.parseInt(resCandidate);

                        if (op == '+') {
                            if (lval + rval == eval) {
                                return leftQ != null && resQ != null ?
                                        d1 + " " + d3 :
                                        leftQ != null ? String.valueOf(d1) :
                                                resQ != null ? String.valueOf(d3) : "";
                            }
                        } else if (op == '-') {
                            if (lval - rval == eval) {
                                return leftQ != null && resQ != null ?
                                        d1 + " " + d3 :
                                        leftQ != null ? String.valueOf(d1) :
                                                resQ != null ? String.valueOf(d3) : "";
                            }
                        } else if (op == '*') {
                            if (lval * rval == eval) {
                                return leftQ != null && resQ != null ?
                                        d1 + " " + d3 :
                                        leftQ != null ? String.valueOf(d1) :
                                                resQ != null ? String.valueOf(d3) : "";
                            }
                        } else if (op == '/') {
                            if (rval != 0 && lval / rval == eval) {
                                return leftQ != null && resQ != null ?
                                        d1 + " " + d3 :
                                        leftQ != null ? String.valueOf(d1) :
                                                resQ != null ? String.valueOf(d3) : "";
                            }
                        }
                    } catch (NumberFormatException e) {
                        // Some candidate produced a bad number, skip
                    }
                    if (resQ == null) break; // Avoid unnecessary loops
                }
                if (rightQ == null) break;
            }
            if (leftQ == null) break;
        }
        return "-1";
    }
}
