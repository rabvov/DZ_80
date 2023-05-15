public class Waite implements Runnable {
    private final Massage msg;

    public Waite(Massage m) {
        this.msg = m;
    }
    @Override
    public void run() {
        synchronized (msg){
            try {
                int f = msg.getMsg();
                    f=f+10;
                msg.setMsg(f);
                msg.wait();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }


}
