package td1.arborescence;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Objects;

public class ArborescenceFiltre {

    public void listArborescenceAnonyme(File pathFile) {

        for (File fileElement : Objects.requireNonNull(pathFile.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory() || pathname.getName().contains(".java")) return true;
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

    public void listArborescenceIntern(File pathFile) {

        ArborescenceFilter af = new ArborescenceFilter();

        for (File fileElement : Objects.requireNonNull(pathFile.listFiles(new ArborescenceFilter()))
                ) {

            if (fileElement.isDirectory()) {
                this.listArborescenceAnonyme(fileElement);
            }

            if (fileElement.isFile()) {
                System.out.println(fileElement);
            }
        }
    }

    public void listArborescenceExtern(File pathFile) {

        ArborescenceFilter af = new ArborescenceFilter();

        for (File fileElement : Objects.requireNonNull(pathFile.listFiles(new ArborescenceFilterExt()))
                ) {

            if (fileElement.isDirectory()) {
                this.listArborescenceAnonyme(fileElement);
            }

            if (fileElement.isFile()) {
                System.out.println(fileElement);
            }
        }
    }


    private class ArborescenceFilter implements FilenameFilter {

        @Override
        public boolean accept(File dir, String name) {
            if (dir.isDirectory() || dir.getName().contains(".java")) return true;
            else return false;
        }

    }
}
