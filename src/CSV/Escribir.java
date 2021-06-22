package CSV;

import CSV.Agregar;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Escribir {
    public static void ExportarCSV(List<Agregar>anime){
        String Ruta="Pendientes.csv";//nombre del archivo
        boolean existe=new File(Ruta).exists();//verificamos que exista el archivo
        if (existe){
            File archivo=new File(Ruta);
            archivo.delete();
        }
        try{//bloque try para crear el archivo
            CsvWriter salidaCSV=new CsvWriter(new FileWriter(Ruta,true),'|');
            //datos para identificar las columnas
            salidaCSV.write("Numero");
            salidaCSV.write("Nombre");
            salidaCSV.endRecord();//deja de escrirbir en el archivo
            //recorremos la lista e insertamos en el archivo 
            for(Agregar agre:anime){
                salidaCSV.write(agre.getNumero());
                salidaCSV.write(agre.getNombre());
                salidaCSV.endRecord();
            }    
            salidaCSV.close();//cerramos el archivo 
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
