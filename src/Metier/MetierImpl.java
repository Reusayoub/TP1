package Metier;

import Dao.Idao;

public class MetierImpl implements IMetier {


    private Idao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.sin(tmp*Math.log(10));
        return res;
    }
    /*
    injecter dans la variable dao un objet
    d'une classe qui implemente l'interface IDao
     */
    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
