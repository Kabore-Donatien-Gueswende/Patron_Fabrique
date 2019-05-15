package tp.fabrique.com;

import tp.abstractFactory.com.AbstractFactory;
import tp.abstractProduct.com.AbstractReine;
import tp.abstractProduct.com.AbstractTroisFromage;
import tp.abstractProduct.com.AbstratorOriental;
import tp.croncreteProduct.com.OrientalSN;
import tp.croncreteProduct.com.ReineSN;
import tp.croncreteProduct.com.TroisFromageSN;


public class FactorySN extends AbstractFactory {

    @Override
    public AbstractReine creerReine() {
        AbstractReine product = new ReineSN();
        return product;
    }

    @Override
    public AbstratorOriental creerOriental() {
        AbstratorOriental product = new OrientalSN();
        return product;
    }

    @Override
    public AbstractTroisFromage creerTroisFromage() {
        AbstractTroisFromage product = new TroisFromageSN();
        return product;
    }
    
}
