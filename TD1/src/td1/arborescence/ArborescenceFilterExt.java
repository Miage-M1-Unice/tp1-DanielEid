package td1.arborescence;

import java.io.File;
import java.io.FilenameFilter;

public class ArborescenceFilterExt implements FilenameFilter {

        @Override
        public boolean accept(File dir, String name) {
            if (dir.isDirectory() || dir.getName().contains(".java")) return true;
            else return false;


    }
}
