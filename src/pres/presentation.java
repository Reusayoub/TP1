package pres;


import Dao.DaoImpl;
import Metier.MetierImpl;
import ext.DaoImpl2;

public class presentation {
    public static void main(String[] args){
        /* injection par instanciation statique "new" des dependances */
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("Resulatst="+metier.calcul());
    }
}
