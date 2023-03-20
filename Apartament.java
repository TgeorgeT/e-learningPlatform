import java.util.HashSet;
import java.util.Set;

public class Apartament {
    static Integer nrCamere;
    Integer pret, dimensiune;
    String data;
    Set<Camera> camere = new HashSet<>();

    Apartament(Integer pret, Integer dimensiune, String data) {
        this.pret = pret;
        this.dimensiune = dimensiune;
        this.data = data;
    }

    void addCamera(Camera c) {
        this.camere.add(c);
    }


    void getCamera(Camera c){
        return camere.contains(c);
    }
    static Integer getNrCamere() {
        return nrCamere;
    }


}
