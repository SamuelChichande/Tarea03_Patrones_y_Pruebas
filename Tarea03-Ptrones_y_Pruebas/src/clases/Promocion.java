package clases;

public class Promocion {
    private String descripcion;
    private float descuento;

    public Promocion(String descripcion, float descuento) {
        this.descripcion = descripcion;
        this.descuento = descuento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

}
