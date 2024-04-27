package ext;

import Dao.Idao;

public class DaoImplVWS implements Idao {
    @Override
    public double getData() {
        System.out.println("Version Web service");
        return 90;
    }
}
