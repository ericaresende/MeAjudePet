package model;

import java.sql.Date;

public class Doacao {
    private float valorPagemento;
    private String alimento;
    private String remedio;
    private Date data;
    private String BanhoETosa;

    public float getValorPagemento() {
        return valorPagemento;
    }
    public void setValorPagemento(float valorPagemento) {
        this.valorPagemento = valorPagemento;
    }
    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    public String getRemedio() {
        return remedio;
    }
    public void setRemedio(String remedio) {
        this.remedio = remedio;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getBanhoETosa() {
        return BanhoETosa;
    }
    public void setBanhoETosa(String banhoETosa) {
        BanhoETosa = banhoETosa;
    }
}
