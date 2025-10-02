
import java.io.*;
import java.util.*;

public class DesvEst {

    public DesvEst() {
    }

    /**
     * Calcula la desviación estándar de un conjunto de datos
     * @param media Media aritmética de los datos
     * @param dataList Lista de datos como strings
     * @param n Número de elementos
     * @return Desviación estándar calculada
     */
    public double getDesvEst(double media, String[] dataList, int n) {
        double sum = 0;
        
        for (int i = 0; i < n; i++) {
            double valor = Double.parseDouble(dataList[i]);
            sum += Math.pow(valor - media, 2);
        }
        
        return Math.sqrt(sum / n);
    }

}