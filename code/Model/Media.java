
import java.io.*;
import java.util.*;

public class Media {

    public Media() {
    }

    private double media;

    /**
     * Calcula la media aritmética de un conjunto de datos
     * @param dataList Lista de datos como strings
     * @param n Número de elementos
     * @return Media aritmética calculada
     */
    public double getMedia(String[] dataList, int n) {
        double sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += Double.parseDouble(dataList[i]);
        }
        
        media = sum / n;
        return media;
    }

}