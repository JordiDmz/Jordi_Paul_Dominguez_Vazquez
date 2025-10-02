
import java.io.*;
import java.util.*;

public class Input {

    private String data;
    private BufferedReader br = null;

    public Input() {
        this.data = "";
    }

    /**
     * Lee datos desde un archivo
     * @param inFile Ruta del archivo a leer
     * @return Datos leídos como cadena
     */
    public String readData(String inFile) {
        try {
            br = new BufferedReader(new FileReader(inFile));
            StringBuilder sb = new StringBuilder();
            String line;
            
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            
            data = sb.toString();
            br.close();
            return data;
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return "";
        }
    }

}