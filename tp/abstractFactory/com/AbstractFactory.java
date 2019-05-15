package tp.abstractFactory.com;

import tp.abstractProduct.com.AbstractReine;
import tp.abstractProduct.com.AbstractTroisFromage;
import tp.abstractProduct.com.AbstratorOriental;
import tp.fabrique.com.FactoryFR;
import tp.fabrique.com.FactorySN;
import tp.fabrique.com.FactoryUS;

public abstract class AbstractFactory {
    public static AbstractFactory createFactory(String type) {
        AbstractFactory factory;
        if(type.equalsIgnoreCase("fr")) {
            factory = new FactoryFR();
        }else if(type.equalsIgnoreCase("us")) {
            factory = new FactoryUS();
        }else {
            factory = new FactorySN();
        }
        return factory;
    }
    
    public abstract AbstractReine creerReine( );
    public abstract AbstratorOriental creerOriental();
    public abstract AbstractTroisFromage creerTroisFromage();

}
