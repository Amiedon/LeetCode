package Design_Pattern;

/**
 * Created by Amie on 2018/8/15.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){}
    public static Singleton getSingleton(){
        return singleton;
    }
    public void showMessage(){
        System.out.println("ssss");
    }
}
