package pres;

import Dao.Idao;
import Metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("C:\\Users\\Ayoub\\IdeaProjects\\TP1\\src\\config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao= Class.forName(daoClassName);
        Idao dao=(Idao) cDao.newInstance();

        String metierClassName=scanner.nextLine();
        Class cMetier= Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao", Idao.class);
        //metier.setDao(dao) statique
        method.invoke(metier,dao);//dynamique

        System.out.println("Resultat="+ metier.calcul());
    }
}