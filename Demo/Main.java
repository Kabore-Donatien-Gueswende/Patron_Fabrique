package Demo;

import tp.abstractFactory.com.AbstractFactory;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AbstractFactory factory = null;
        factory = AbstractFactory.createFactory("SN");
        factory.creerTroisFromage().service();
        factory.creerOriental().service();
        factory.creerReine().service();;
        System.out.println("*******************************");
        factory = AbstractFactory.createFactory("FR");
        factory.creerTroisFromage().service();
        factory.creerOriental().service();
        factory.creerReine().service();
        System.out.println("*******************************");
        factory = AbstractFactory.createFactory("US");
        factory.creerTroisFromage().service();
        factory.creerOriental().service();
        factory.creerReine().service();
     }
}
