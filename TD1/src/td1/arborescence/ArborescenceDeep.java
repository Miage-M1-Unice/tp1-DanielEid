package td1.arborescence;

import java.io.File;

public class ArborescenceDeep {

    public void listArborescence(File pathFile){


        for (File fileElement: pathFile.listFiles()
                ) {

            if (fileElement.isDirectory())
                this.listArborescence(fileElement);

            System.out.println(fileElement);
        }
    }

}
