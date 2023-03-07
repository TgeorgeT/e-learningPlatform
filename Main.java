import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aliment> alimente=List.of(new Carne(1234L,10.5,1.05,"vita"),
                            new Cereale(1234L,12.3,1.05,"lapte","Nestle"),
                            new Lapte(1234L,12.3,1.05,"lapte"));

        List<Aliment> sortat = alimente.stream().sorted(
                (a1,a2)->a1.getCalorii().compareTo(a2.getCalorii())
        ).toList();



    }
}


