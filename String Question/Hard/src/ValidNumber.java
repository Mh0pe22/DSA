public class ValidNumber {
    public static void main(String[] args) {
        String s = "+.";
        System.out.println(isValidNumber(s));
    }

    public static boolean isValidNumber(String s){

        if (s.length() == 1 && (s.charAt(0) == '.' || s.charAt(0) == '+' || s.charAt(0) == '-')) {
            return false;
        }

        boolean hasDecimal = false;
        boolean hasExponent = false;
        boolean hasDigitBeforeE = false;
        boolean hasDigitAfterE = false;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '+' || current == '-') {
                if (i != 0 && (s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')) {
                    return false;
                }

                if (i == s.length() - 1) {
                    return false;
                }
            }
            else if (current >= '0' && current <= '9') {
                if (!hasExponent) {
                    hasDigitBeforeE = true;
                } else {
                    hasDigitAfterE = true;
                }
            }
            else if (current == '.') {
                if (hasDecimal || hasExponent) {
                    return false;
                }
                hasDecimal = true;
            }
            else if (current == 'e' || current == 'E') {
                if (hasExponent || !hasDigitBeforeE || i == s.length() - 1) {
                    return false;
                }
                hasExponent = true;
            }
            else {
                return false;
            }
        }

        if (hasExponent && !hasDigitAfterE) {
            return false;
        }

        return hasDigitBeforeE;
    }
}
