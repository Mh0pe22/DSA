public class BankAccount {

    public static int balance = 700;
    public class BankActivity implements Runnable{

        @Override
        public void run(){
            balance += 10;
        }
    }
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        Thread[] thread = new Thread[100];

        for (int i = 0; i < 100; i++) {
            Thread temp = new Thread(ba.new BankActivity());
            thread[i] = temp;
        }

        for (int i = 0; i < 100; i++) {
            thread[i].start();
        }

        for (int i = 0; i < 100; i++) {
            try{
                thread[i].join();
            }catch (Exception ex){

            }
        }

        System.out.println(balance);
    }

}
