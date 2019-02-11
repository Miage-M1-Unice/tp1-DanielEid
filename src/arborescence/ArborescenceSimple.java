package arborescence;

import java.io.File;

public class ArborescenceSimple {


   public void listArborescence(String pathDir){
       File file = new File(pathDir);

       for (File fileElement: file.listFiles()
            ) {
           System.out.println(fileElement);
       }
   }


}
