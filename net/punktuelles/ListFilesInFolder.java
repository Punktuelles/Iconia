package net.punktuelles;

import java.io.File;

public class ListFilesInFolder {
    public static void main(String[] args) {
        // Ersetze "Pfad/zum/Ordner" durch den Pfad des Ordners, den du anzeigen möchtest.
        String ordnerPfad = "/home/era/";

        File ordner = new File(ordnerPfad);

        // Überprüfe, ob der angegebene Pfad ein Verzeichnis ist.
        if (ordner.isDirectory()) {
            // Erhalte eine Liste der Dateien und Unterverzeichnisse im Ordner.
            File[] dateienUndVerzeichnisse = ordner.listFiles();

            if (dateienUndVerzeichnisse != null) {
                System.out.println("Inhalt des Ordners " + ordnerPfad + ":");

                // Gehe die Liste durch und gib den Namen jedes Elements aus.
                for (File element : dateienUndVerzeichnisse) {
                    System.out.println(element.getName());
                }
            } else {
                System.err.println("Der Ordner ist leer oder konnte nicht gelesen werden.");
            }
        } else {
            System.err.println(ordnerPfad + " ist kein Verzeichnis.");
        }
    }
}
