import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Camera {
    String denumire;
    List<utilitate> utilitati = new ArrayList<>();

    Camera(String denumire) {
        this.denumire = denumire;
    }

    void addUtilitate(utilitate u) {
        this.utilitati.add(u);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camera camera = (Camera) o;
        return Objects.equals(denumire, camera.denumire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denumire);
    }
}
