package tp.fabrique.com;

import tp.abstractFactory.com.AbstractFactory;
import tp.abstractProduct.com.AbstractReine;
import tp.abstractProduct.com.AbstractTroisFromage;
import tp.abstractProduct.com.AbstratorOriental;
import tp.croncreteProduct.com.OrientalFR;
import tp.croncreteProduct.com.ReineFR;
import tp.croncreteProduct.com.TroisFromageFR;

public class FactoryFR extends AbstractFactory{

    @Override
    public AbstractReine creerReine() {
        AbstractReine product =  new ReineFR();          
        return product;
    }

    @Override
    public AbstratorOriental creerOriental() {
        AbstratorOriental product = new OrientalFR();
        return product;
    }

    @Override
    public AbstractTroisFromage creerTroisFromage() {
        AbstractTroisFromage product = new TroisFromageFR(); 
            return product;
    }
    
}
