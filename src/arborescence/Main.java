package arborescence;

import java.io.File;

public class Main {

    public static void main(String[] args){

        ArborescenceSimple a= new ArborescenceSimple();
        //a.listArborescence(".");

        ArborescenceDeep b = new ArborescenceDeep();
        b.listArborescence(new File("."));

    }

}
