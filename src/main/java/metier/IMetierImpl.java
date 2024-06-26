package metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class IMetierImpl implements IMetier {
    //@Autowired

    private IDao dao;

    //Injection via constructeur
    public IMetierImpl(IDao dao){
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*50-3;
        return res;
    }

//    public void setDao(IDao dao) {
//        this.dao = dao;
//    }
}
