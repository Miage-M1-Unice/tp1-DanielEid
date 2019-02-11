package arborescence;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Objects;

public class ArborescenceFiltre {

    public void listArborescenceAnonyme(File pathFile){


        for (File fileElement: Objects.requireNonNull(pathFile.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()||pathname.getName().contains(".java")) return true;
                else return false;
            }
        }))
                ) {

            if (fileElement.isDirectory()) {
                this.listArborescenceAnonyme(fileElement);
            }

            if (fileElement.isFile()) {
                System.out.println(fileElement);
            }
        }
    }

   /* public void listArborescenceIntern(File pathFile){


        for (File fileElement: pathFile.listFiles()
                ) {

            if (fileElement.isDirectory())
                this.listArborescenceIntern(fileElement);

            System.out.println(fileElement);
        }
    }*/


    /*private class ArborescenceFilter implements FilenameFilter {

        private String filtre;

        public ArborescenceFilter(String filtre) {
            this.filtre = filtre;
        }

        @Override
        public boolean accept(File dir, String name) {
            return dir.isFile();
        }
    }*/

}
