public class Aliment {
    Long dataExp;
    Double pret;
    String ingrediente;
    Double calorii;

    public Long getDataExp() {
        return dataExp;
    }

    public void setDataExp(Long dataExp) {
        this.dataExp = dataExp;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Double getCalorii() {
        return calorii;
    }

    public void setCalorii(Double calorii) {
        this.calorii = calorii;
    }

    public Aliment(){

    };
    public Aliment(Long dataExp, Double pret, Double calorii, String ingrediente) {
        this.calorii=calorii;
        this.dataExp=dataExp;
        this.pret=pret;
        this.ingrediente=ingrediente;
    }
}
