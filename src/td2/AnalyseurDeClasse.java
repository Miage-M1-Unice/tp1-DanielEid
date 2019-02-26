package td2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnalyseurDeClasse {

    public void analyseClasse(String nomClasse) throws ClassNotFoundException {

        Class cl = getClasse(nomClasse);

        System.out.print("\n");
        afficheEnTeteClasse(cl);

        System.out.println();
        afficheAttributs(cl);

        System.out.println();
        afficheConstructeurs(cl);

        System.out.println();
        afficheMethodes(cl);

        // L'accolade fermante de fin de classe !
        System.out.println("\n}");
    }


    public static Class getClasse(String nomClasse) throws ClassNotFoundException {
        return Class.forName(nomClasse);
    }

    public void afficheEnTeteClasse(Class cl) {

        //  Affichage modifier et nom de la classe
        System.out.println("Modifier: " + cl.getModifiers());
        System.out.println("Nom de la classe : " + cl.getName() + " {");

        // Récupération de la superclasse si elle existe (null si cl est le type Object)
        System.out.println("\n"+"Super Classe : " + getSuperclasse(cl));

        // Affichage des interfaces
        System.out.println("\n" + "Liste interfaces [");
        afficherInterfaces(cl);
        System.out.println("]");

    }

    public Class getSuperclasse(Class cl) {
        if (cl.getSuperclass().getName() != "java.lang.Object") {
            return cl.getSuperclass();
        }
        return null;
    }


    public void afficherInterfaces(Class cl) {

        Class[] clInterfaces = cl.getInterfaces();

        for (Class interfaceElem : clInterfaces) {
            System.out.println(interfaceElem);
        }
    }


    public void afficheAttributs(Class cl) {
        Field[] clFields = cl.getFields();

        System.out.println("Liste attributs [");

        for (Field fieldElement : clFields) {
            System.out.println(fieldElement);
        }

        System.out.println("]");
    }

    public void afficheConstructeurs(Class cl) {
        Constructor[] clConstructors = cl.getConstructors();

        System.out.println("Liste constructeurs [");

        for (Constructor constructorElement : clConstructors) {
            System.out.println(constructorElement);
        }

        System.out.println("]");

    }

    public void afficheMethodes(Class cl) {
        Method[] clMethods = cl.getMethods();

        System.out.println("Liste methodes [");

        for(Method methodElement : clMethods){
            System.out.println(methodElement);
        }

        System.out.println("]");

    }

}


