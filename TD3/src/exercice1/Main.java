package exercice1;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {

    public static void main(String Args[]){

        try {

            URL[] urlList= new URL[]{new URL("file:///N:/MIAGE/M1/S8/PA- Programation avancée/TD/tp1-DanielEid/TD3/out/production/TD3-exo1/exercice1/")};
            URLClassLoader urlLoader ;


            urlLoader= new URLClassLoader(urlList);
            urlLoader.loadClass("miage.m1.Test");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
