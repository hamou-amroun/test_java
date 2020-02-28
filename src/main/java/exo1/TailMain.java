package exo1;

import org.apache.commons.io.input.ReversedLinesFileReader;

import java.io.*;
import java.util.logging.Logger;

public class TailMain {

    private static final Logger LOGGER = Logger.getGlobal();
    private static final String PATH_TO_FILE = "/home/amroun/dev/project_java_for_test/src/main/resources/exo1/text.txt";

    public static void main(String[] args) {
        try {
            writeTheFile();
            readLastLinesOfFle(5, PATH_TO_FILE);
        } catch (IOException e) {
            LOGGER.warning("The exception is : " + e);
        }
    }

    private static void readLastLinesOfFle(int lastLines, String pathToFile) throws IOException {
        try {
            File file = new File(pathToFile);
            int counter = 0;
            ReversedLinesFileReader object = new ReversedLinesFileReader(file);
            while (counter < lastLines) {
                System.out.println(object.readLine());
                counter++;
            }
        } catch (FileNotFoundException e) {
            LOGGER.warning("The exception is : " + e);
        }
    }

    private static void writeTheFile() throws IOException {
        StringBuilder stringBuilderText = new StringBuilder("Hello world\n")
                .append("Line2\n")
                .append("Line3\n")
                .append("Line4\n")
                .append("Line5\n")
                .append("Line6\n")
                .append("Line7\n")
                .append("Line8\n")
                .append("Line9\n")
                .append("Line10\n")
                .append("Line11\n")
                .append("Line12\n")
                .append("Line13\n")
                .append("Line14\n")
                .append("Line15\n")
                .append("Line16\n");
        BufferedWriter output = null;
        File file = new File(PATH_TO_FILE);
        output = new BufferedWriter(new FileWriter(file));
        output.write(stringBuilderText.toString());
        if (output != null) {
            output.close();
        }
    }
}
