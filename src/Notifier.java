public class Notifier implements Runnable   {
    private final Massage msg;

    public Notifier(Massage x) {
        this.msg = x;
    }


    @Override
    public void run() {
synchronized (msg){
    int n = msg.getMsg();
      n=n-5;
    msg.setMsg(n);
    System.out.println(msg.getMsg());
    msg.notifyAll();
}
    }
}
