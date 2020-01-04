package SPDB;

/**
 * Created by Amie on 2019/8/6.
 */
public class ProxyFactory {
    public static ILawSuit getProxy(){
        return new ProxyLawyer(new SecondDogWang());
    }

    public static void main(String[] args) {
        ProxyFactory.getProxy().submit("工资流水");
        ProxyFactory.getProxy().defend();
    }
}
