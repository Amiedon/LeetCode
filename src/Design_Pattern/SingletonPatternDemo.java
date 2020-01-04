package Design_Pattern;

/**
 * Created by Amie on 2018/8/15.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        //Singleton singleton = new Singleton();
        singleton.showMessage();
    }
}
