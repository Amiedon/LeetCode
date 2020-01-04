package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Amie on 2019/8/6.
 */
public class DynProxyLawyer implements InvocationHandler {
    private Object object;

    public DynProxyLawyer(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("案件进展:"+ method.getName());
        return method.invoke(object, args);
    }
}
