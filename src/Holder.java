public class Holder {
    private int data;
    private boolean isProduced = false;

    public synchronized void put(int data) {
        if(isProduced == false) {
            this.data = data;
            System.out.println("Put: " + data);
            isProduced = true;
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void get() {
        if(isProduced == true) {
            System.out.println("Got: " + data);
            isProduced = false;
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
