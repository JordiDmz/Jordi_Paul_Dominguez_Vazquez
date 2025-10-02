
import java.io.*;
import java.util.*;

public class Data {

    public Data() {
    }

    /**
     * Método para guardar datos y convertirlos en un array
     * @param data Datos a guardar
     * @return Array de strings con los datos procesados
     */
    public String[] saveData(String data) {
        return data.split(" ");
    }

}