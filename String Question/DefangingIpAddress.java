public class DefangingIpAddress {
    public static void main(String[] args) {
        String ip = "1.1.1.1";
        System.out.println(defangingIPAddress(ip));
    }

    public static String defangingIPAddress(String address){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if(ch == '.'){
                ans.append("[.]");
            }else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
