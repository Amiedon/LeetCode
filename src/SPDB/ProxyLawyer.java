package SPDB;

/**
 * Created by Amie on 2019/8/6.
 */
public class ProxyLawyer implements ILawSuit {
    ILawSuit plaintiff;

    public ProxyLawyer(ILawSuit plaintiff) {
        this.plaintiff = plaintiff;
    }

    @Override
    public void submit(String proof) {
        plaintiff.submit(proof);
    }

    @Override
    public void defend() {
        plaintiff.defend();
    }
}
