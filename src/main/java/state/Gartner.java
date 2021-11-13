package state;

public class Gartner {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Dig){
            setActivity(new Relax());
        }else if (activity instanceof Relax){
            setActivity(new Fly());
        }else if (activity instanceof Fly){
            setActivity(new Compete());
        }else if (activity instanceof Compete){
            setActivity(new Dig());
        }
        System.out.println("=========================================================================================");
    }

    public void process(){
        activity.process();
    }
}
