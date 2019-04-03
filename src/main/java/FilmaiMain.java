
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kotryna
 */
public class FilmaiMain {

    public static void main(String[] args) {
        FilmuSarasas nuskaitymas = new FilmuSarasas();
        List<Filmas> list = nuskaitymas.getFilmai();

        FilmuPaieska paieska = new FilmuPaieska(list);
        
       List<Filmas> result= paieska.paieska("bgybhunhunhunu");
       
        for (Filmas filmas : result) {
            System.out.println("pavadinimas: "+filmas.getPavadinimas());
        }
    }

}
