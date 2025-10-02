
import java.io.*;
import java.util.*;

public class OutPut {

    public OutPut() {
    }

    /**
     * Escribe datos en un archivo
     * @param outFile Ruta del archivo de salida
     * @param outText Texto a escribir en el archivo
     */
    public void writeData(String outFile, String outText) {
        try {
            FileWriter fw = new FileWriter(outFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(outText);
            bw.close();
            System.out.println("Datos escritos correctamente en: " + outFile);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

}