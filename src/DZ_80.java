public class DZ_80 {
    public static void main(String[] args) {
            int x=0;
            Massage massage = new Massage(x);
            Waite waite = new Waite(massage);
            new Thread(waite).start();
            Notifier notifier = new Notifier(massage);
            new Thread(notifier).start();

    }
}
