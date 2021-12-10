package Mnogopotocyjst;

public class Test {
    public static void main(String[] args) {
    //     MyThread myThread = new MyThread();

    //     myThread.start();

    //     System.out.println("Hello from main thread");
    // }

    Thread thread = new Thread(new Runner());
    thread.start();

}

}

class Runner implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub

        for(int i=0;i<100; i++){
            try {
                Thread.sleep(1000); // пауза в милли сикундах
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Hello from Runnable "+i);
        }
        
    }
}



    class MyThread extends Thread {

        public void run(){
            for(int i=0;i<100; i++){
                try {
                    Thread.sleep(1000); // пауза в милли сикундах
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("Hello from MyThread");
            }
        }
    }
    

