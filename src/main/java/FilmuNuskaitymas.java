
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
public class FilmuNuskaitymas {

    public List<Filmas> nuskaityti() {

        List<Filmas> filmai = new ArrayList<>();

        filmai.add(new Filmas("american beauty", Zanras.komedija, 1999, "Petras Petraitis", "Petras Petrauskas", 9.9));
        filmai.add(new Filmas("terminator", Zanras.komedija, 1999, "Petras Petraitis", "Petras Petrauskas", 9.9));

        return filmai;
    }

}
