package arborescence;

import java.io.File;

public class Main {

    public static void main(String[] args){

        /**
         * @info: Retirez les commentaires pour executer le code
         * */

        ArborescenceSimple a= new ArborescenceSimple();
        //a.listArborescence(new File("."));

        ArborescenceDeep b = new ArborescenceDeep();
        //b.listArborescence(new File("."));

        ArborescenceFiltre c = new ArborescenceFiltre();

        c.listArborescenceAnonyme(new File("."));
        //c.listArborescenceIntern(new File("."));
        c.listArborescenceIntern(new File("."));


    }

}
