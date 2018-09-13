package com.example.usuario.tallerlistview2018;

public class Resultado {
    private String oper;
    private Double dat1;
    private Double dat2;
    private Double res;

    public Resultado(String oper, Double dat1, Double dat2, Double res) {
        this.oper = oper;
        this.dat1 = dat1;
        this.dat2 = dat2;
        this.res = res;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public Double getDat1() {
        return dat1;
    }

    public void setDat1(Double dat1) {
        this.dat1 = dat1;
    }

    public Double getDat2() {
        return dat2;
    }

    public void setDat2(Double dat2) {
        this.dat2 = dat2;
    }

    public Double getRes() {
        return res;
    }

    public void setRes(Double res) {
        this.res = res;
    }

    public void guardar(){
        DatosResultado.guardar(this);
    }
}
