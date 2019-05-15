package tp.fabrique.com;

import tp.abstractFactory.com.AbstractFactory;
import tp.abstractProduct.com.AbstractReine;
import tp.abstractProduct.com.AbstractTroisFromage;
import tp.abstractProduct.com.AbstratorOriental;
import tp.croncreteProduct.com.OrientalUS;
import tp.croncreteProduct.com.ReineUS;
import tp.croncreteProduct.com.TroisFromageUS;

public class FactoryUS extends AbstractFactory  {

    @Override
    public AbstractReine creerReine() {
        AbstractReine product = new ReineUS();
        return product;
    }

    @Override
    public AbstratorOriental creerOriental() {
        AbstratorOriental product = new OrientalUS();
        return product;
    }

    @Override
    public AbstractTroisFromage creerTroisFromage() {
        AbstractTroisFromage product = new TroisFromageUS();
        return product;
    }

}
