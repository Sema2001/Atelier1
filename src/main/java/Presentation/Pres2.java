package Presentation;

import Dao.IDao;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main (String[] args) throws Exception{
//        Instanciation dynamique
        Scanner input = new Scanner(new File("config.txt"));
        String daoClassName = input.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao)cDao.newInstance();
        System.out.println(dao.getData());
    }
}
