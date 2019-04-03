
import java.util.ArrayList;
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
public class FilmuSarasas {

    private List<Filmas> films = new ArrayList<>();

    {
        films.add(new Filmas("Notting Hill", Zanras.drama, 0, "James Cameron", "Julia Roberts", 0));
        films.add(new Filmas("Notting Hill", Zanras.drama, 0, "James Cameron", "Julia Roberts", 0));
        films.add(new Filmas("Notting Hill", Zanras.drama, 0, "James Cameron", "Julia Roberts", 0));
        films.add(new Filmas("Notting Hill", Zanras.drama, 0, "James Cameron", "Julia Roberts", 0));
        films.add(new Filmas("Notting Hill", Zanras.drama, 0, "James Cameron", "Julia Roberts", 0));
        films.add(new Filmas("Notting Hill", Zanras.drama, 0, "James Cameron", "Julia Roberts", 0));
        films.add(new Filmas("Notting Hill", Zanras.drama, 0, "James Cameron", "Julia Roberts", 0));
        films.add(new Filmas("Notting Hill", Zanras.drama, 0, "James Cameron", "Julia Roberts", 0));
        films.add(new Filmas("Notting Hill", Zanras.drama, 0, "James Cameron", "Julia Roberts", 0));
        films.add(new Filmas("Notting Hill", Zanras.drama, 0, "James Cameron", "Julia Roberts", 0));
        films.add(new Filmas("american beauty", Zanras.drama, 1999, "Petras Petraitis", "Petras Petrauskas", 9.9));
        films.add(new Filmas("terminator", Zanras.komedija, 1999, "Petras Petraitis", "Petras Petrauskas", 9.9));
        films.add(new Filmas("bjaurusis as", Zanras.drama, 2015, "Onute Grazinyte", "Migle Siauruseviciute", 8.0));
        films.add(new Filmas ("Notting Hill", Zanras.romantinis, 1997, "James Cameron", "Julia Roberts", 7.9));
       
        
        
        
        
//        films.add(new FilmuSarasas"Terminatorius");
//films.add(new FilmuSarasas , "Bjaurusis as");
    }

    public List<Filmas> getFilmai() {

        return films;

    }

    // American Beauty;
    // Terminatorius;
}
