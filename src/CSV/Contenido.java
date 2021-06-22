package CSV;
import CSV.Agregar;
import CSV.Escribir;
import static CSV.Escribir.ExportarCSV;
import Interfaz.*;
import java.util.ArrayList;
import java.util.List;
public class Contenido {
    public static void main(String[] args) {
        
        /*Inicio ini=new Inicio();
        ini.setVisible(true);
        */
        List<Agregar>anime=new ArrayList<Agregar>();
        anime.add(new Agregar("01","Higurashi"));
        anime.add(new Agregar("02","Inuyasha"));
        Escribir es=new Escribir();
        ExportarCSV(anime);
    }
    
}
