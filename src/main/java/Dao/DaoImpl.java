package Dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("BD version");
        double temp = Math.random()*40;
        return temp;

    }
}
