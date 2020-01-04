package DynamicProxy;

import SPDB.ILawSuit;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Amie on 2019/8/6.
 */
public class ProxyFactory {

    public static Object getDynProxy(Object object){
        InvocationHandler invocationHandler = new DynProxyLawyer(object);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), invocationHandler);
    }

    public static void main(String[] args) {
        ILawSuit proxy = (ILawSuit) ProxyFactory.getDynProxy(new CuiHuaNiu());
        proxy.submit("工资流水在此");
        proxy.defend();
    }
}
