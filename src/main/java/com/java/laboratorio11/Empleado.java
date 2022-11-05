package com.java.laboratorio11;

/**
 *
 * @author codeli4m
 */
public class Empleado {
    private String codigo;
    private String nombre;
    private String area;
    private double sueldoBase;
    private double horasExtras;
    private String tipoSeguro;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }
    
    public double montoHorasExtras(){
        return sueldoBase * horasExtras / 240;
    }
    
    public double montoSeguro(){
        if(tipoSeguro.equalsIgnoreCase("AFP")){
            return sueldoBase * 0.17;
        }
        if(tipoSeguro.equalsIgnoreCase("SNP")){
            return sueldoBase * 0.05;
        }
        return 0;
    }
    
    public double montoEssalud(){
        return sueldoBase * 0.03;
    }
    
    public double montoDescuentos(){
        return montoSeguro() + montoEssalud();
    }
    
    public double sueldoBruto(){
        return sueldoBase + montoHorasExtras();
    }
    
    public double sueldoNeto(){
        return sueldoBruto() + montoDescuentos();
    }
}
