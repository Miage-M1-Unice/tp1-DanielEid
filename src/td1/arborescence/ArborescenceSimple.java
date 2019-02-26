package td1.arborescence;

import java.io.File;

public class ArborescenceSimple {


   public void listArborescence(File pathDir){

       for (File fileElement: pathDir.listFiles()
            ) {
           System.out.println(fileElement);
       }
   }


}
