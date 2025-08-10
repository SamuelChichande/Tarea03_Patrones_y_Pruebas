/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Schic
 */
public class Incidente {
    private String incidente;
    private String estado;
    private Usuario reportadoPor;

    public Incidente(String incidente, String estado, Usuario reportadoPor) {
        this.incidente = incidente;
        this.estado = estado;
        this.reportadoPor = reportadoPor;
    }

    public String getIncidente() {
        return incidente;
    }

    public void setIncidente(String incidente) {
        this.incidente = incidente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getReportadoPor() {
        return reportadoPor;
    }

    public void setReportadoPor(Usuario reportadoPor) {
        this.reportadoPor = reportadoPor;
    }

}
