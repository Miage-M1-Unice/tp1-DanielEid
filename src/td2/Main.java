package td2;

public class Main {

    public static void main(String[] args){


        //Analyseur de classe
        try {
            new AnalyseurDeClasse().analyseClasse("java.awt.Point");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        
    }

}
