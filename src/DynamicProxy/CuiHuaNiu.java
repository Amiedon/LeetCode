package DynamicProxy;

import SPDB.ILawSuit;

/**
 * Created by Amie on 2019/8/6.
 */
public class CuiHuaNiu implements ILawSuit {
    @Override
    public void submit(String proof) {
        System.out.println(String.format("老板欠薪跑路，证据如下%s",proof));
    }

    @Override
    public void defend() {
        System.out.println(String.format("%s快还钱","老板"));
    }
}
