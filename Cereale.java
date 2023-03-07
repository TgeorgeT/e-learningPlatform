public class Cereale extends Aliment{
    String tip;
    public Cereale(Long dataExp, Double pret, Double calorii, String ingrediente,String tip) {
        this.calorii=calorii;
        this.dataExp=dataExp;
        this.pret=pret;
        this.ingrediente=ingrediente;
        this.tip=tip;
    }
}
