/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principales;

/**
 *
 * @author user
 */
public class descuentos {
    
    int id_descuento;
    String fecha;
    String descripcion;
    int unidad;
    int precio;
    int total;
    String placa;
    int id_vehiculo;

    public descuentos() {
    }

    public descuentos(int id_descuento, String fecha, String descripcion, int unidad, int precio, int total, String placa, int id_vehiculo) {
        this.id_descuento = id_descuento;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.unidad = unidad;
        this.precio = precio;
        this.total = total;
        this.placa = placa;
        this.id_vehiculo = id_vehiculo;
    }

    public int getId_descuento() {
        return id_descuento;
    }

    public void setId_descuento(int id_descuento) {
        this.id_descuento = id_descuento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    
    
    
    
}
