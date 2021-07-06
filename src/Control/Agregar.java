package Control;

import java.io.*;
import java.util.Scanner;

public class Agregar {

    public void Archivo(long lineas, String nombre) {
        try {
            File file = new File("Pendientes.txt");
            if (file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            lineas = lineas + 1;
            bw.write(lineas + "|" + nombre + "\n");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public long lineas() {
        long lNumeroLineas = 0;

        try {
            FileReader fr = new FileReader("Pendientes.txt");

            BufferedReader bf = new BufferedReader(fr);

            while ((bf.readLine()) != null) {
                lNumeroLineas++;
            }

            bf.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return (lNumeroLineas);
    }

    public int Repetido(String nombre) {
        boolean contiene = false;
        Scanner entrada = null;
        String linea;
        int numeroDeLinea = 1;
        try {
            File f = new File("Pendientes.txt");
            entrada = new Scanner(f);
            
            while(entrada.hasNext()){
                linea = entrada.nextLine();
                if (linea.contains(nombre)) {
                    contiene = true;
                }
                numeroDeLinea++;
            }
        } catch (Exception e) {

        }
        return numeroDeLinea;
    }
}
