package ext;

import Dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("version capteur");
        return 89;
    }
}
