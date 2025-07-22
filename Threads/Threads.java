public class Threads {
    public class GetWeather implements Runnable{

        @Override
        public void run(){

        }
    }

    public void startThread(){
        Thread t1  = new Thread(new GetWeather());
    }
}
