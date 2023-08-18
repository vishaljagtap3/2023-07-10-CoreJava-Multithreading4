public class Main {
    public static void main(String[] args) {

        Holder holder = new Holder();

        new Consumer(holder).start();
        new Producer(holder).start();



    }
}
