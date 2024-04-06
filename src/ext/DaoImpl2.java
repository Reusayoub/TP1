package ext;

import Dao.Idao;

public class DaoImpl2 implements Idao {


    @Override
    public double getData() {

        System.out.println("Version Capteurs");
        double temp=1000;
        return temp;
    }
}
