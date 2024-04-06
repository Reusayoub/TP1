package Dao;

public class DaoImpl implements Idao {
    @Override
    public double getData() {
        /* se connecter a la BD et recup la temp

         */
        double temp=Math.random()*40;
        return temp;
    }
}
