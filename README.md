# Patron_Fabrique

Nous allons dans ce projet implementer le patron de frabrique qui va nous permettre d'intancier different objet (ici il sagira de different
types de pizzas (reine, oriental, trois fromages) à partir de trois fabrique differentes (US, SN, FR).
Nous suivrons le modele donné en cours qui peut etre illustré avec l'image ci-dessous : 

![alt tag](https://github.com/Kabore-Donatien-Gueswende/Patron_Fabrique/blob/master/img/schema.png)

La seule difference est que nous disposons dans le cadre de notre projet de 3 __"abstractProduct"__ (reine, oriental, trois fromages) et 
de trois __Concretefactory__ (US,SN,FR) au lieu de 2 ici.

Sans plus tarder nous allons commencer par la creation de nos trois __abstractProduct__ :
nous allons utiliser des interfaces :

          public interface AbstractReine {
              public void service();
          }
          
          
          public interface AbstractTroisFromage {
              public void service();
          }
          
          
          public interface AbstratorOriental {
              public void service();
          }
          
Pas du tout enorme, nous l'avouons, chaque classe concrete implementera une de ces interfaces, pour plus de clarté dans l'explication nous
allons juste implementer quelques classes à titre d'exemple, puisque nous disposons de 3 classes par interface (nous allons illustrer ceci
avec l'interface __AbstratorOriental__) :

        public class OrientalFR implements AbstratorOriental {
            @Override
            public void service() {
                System.out.println("Oriental FR");
            }
        }
        
        
        public class OrientalSN implements AbstratorOriental {
            @Override
            public void service() {
                System.out.println("Oriental SN");
            }
        }
        
        
        public class OrientalUS implements AbstratorOriental{
            @Override
            public void service() {
                System.out.println("Oriental US");
            }
        }
        
   C'est la meme procedure a suivre pour les autre interfaces.
   
   A la fin de ce periple, nous pouvons creer une classe abstrait qui servira de __fabrique__ ou __factory__ : 
   
           public abstract class AbstractFactory {
                public static AbstractFactory createFactory(String type) {
                    AbstractFactory factory;
                    if(type.equalsIgnoreCase("FR")) {
                        factory = new FactoryFR();
                    }else if(type.equalsIgnoreCase("US")) {
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
        
 Il dispose d'une methode __createFactory__  qui permet d'intancier un objet en fonction des arguments recuent en parametre et 
 dispose egalement de methode abstraite qui seront implementé par les __ConcreteFactory__, constat ci-desous :
    
    
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
          
   c'est claire, pour chaque methode abstrait, la __ConcreteFactory__ retourne un objet du type souhaité. il sagit de meme pour les 
   2 __fabrique__ restants (comme l'indique le code joint).
   
   Une fois tout ces etapes passé nous pouvons passer à la demo :simple_smile: :
   
               public class Main {
                public static void main(String[] args) {
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
   Cette classe __Main__ montre la simplicité d'intancier un objet rien qu'en saisissant la valeur __SN__ (qui rappelons est la valeur
   par defaut) __US__ ou __FR__ nous pouvons instancier l'objet souhaité (rappelons que la classe __Main__ n'a aucune lien direct avec
   ces classes concretes)
   
   Et cela nous donne l'image ci-desous : :blush:
   
   ![alt tag](https://github.com/Kabore-Donatien-Gueswende/Patron_Fabrique/blob/master/img/demo.PNG)
   
   
   Dans cet projet nous aurions appris comment l'organisation de nos objet est important avec le patron fabrique, qui permet
   d'instancier des objets dont le type est dérivé d'un type abstrait. La classe exacte de l'objet n'est donc pas connue par l'appelant, 
   un couplage assez faible qui permet de faire des modifications sur les classes concretes sans toucher biensur la classe appelante:exclamation:
   
