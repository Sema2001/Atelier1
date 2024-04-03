package Presentation;

import Dao.DaoImpl;
import ext.DaoImpl2;
import metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args){
        //Instantiation statique => new


        DaoImpl2 dao2 = new DaoImpl2();
        DaoImpl dao = new DaoImpl();
        IMetierImpl metier = new IMetierImpl(dao);
       // metier.setDao(dao2);
        System.out.println("RES "+ metier.calcul());
    }
}
