package td2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static String lectureClavier() throws IOException{
       return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static void main(String[] args){


        //Analyseur de classe
        try {
            System.out.println("Entrez le nom de la classe auquel vous voulez obtenir des informations: ");
            new AnalyseurDeClasse().analyseClasse(Main.lectureClavier());  //"java.awt.Point"
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
