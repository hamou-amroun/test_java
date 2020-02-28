package exo2;

import java.io.*;

public class SerializeMain {

    private static String PERSON = "hamou";
    private static final String PATH_TO_FILE = "/home/amroun/dev/project_java_for_test/src/main/resources/exo2/marin.ser";

    public static void main(String[] args) {
        System.out.println("the name of the person is : " + PERSON);
        System.out.println("Here we are trying to serialize ");


        try {
            // dans une méthode main
            // on simplifie le code en retirant la gestion des exceptions
            File fichier = new File(PATH_TO_FILE);

            // ouverture d'un flux sur un fichier
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichier));

            // création d'un objet à sérializer.toString()
            Marin m = new Marin("Surcouf", "Robert");

            m.setAlex(new Alex("AlexP", "AlexN"));

            // sérialization de l'objet
            oos.writeObject(m);

            // fermeture du flux dans le bloc finally
            oos.close();

        } catch (IOException ioe) {
            System.out.println("the IOException is : " + ioe);
        }

        System.out.println("Here we are trying to deserialize ");

        try {
            // dans une méthode main
            // on simplifie le code en retirant la gestion des exceptions
            File fichier = new File(PATH_TO_FILE);

            // ouverture d'un flux sur un fichier
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichier));
            // désérialization de l'objet
            Marin m = null;
            try {
                m = (Marin) ois.readObject();
            } catch (ClassNotFoundException e) {
                System.out.println("the ClassNotFoundException  : " + e);
            }
            System.out.println(m);
            // fermeture du flux dans le bloc finally
        } catch (IOException ioe) {
            System.out.println("the IOException is : " + ioe);
        }


    }
}
