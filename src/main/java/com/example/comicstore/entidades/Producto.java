package com.example.comicstore.entidades;

public class Producto {

    private Integer id; //como identifico el producto
    private String nombre;

    private String foto;
    private String descripcion;
    private Integer cantidad;
    private Double precioUnitario;
    private String clasificacion;
    private String marca;
    private String presentacion;
    private Double peso;
    private Boolean estado;
    private String proveedor;
    private Double volumen;
    private String fechaIngreso;
    private Boolean aplicaDescuento;
    private String fechaVencimiento;

    public Producto() {



    }

    public Producto(Integer id, String nombre, String foto, String descripcion, Integer cantidad, Double precioUnitario, String clasificacion, String marca, String presentacion, Double peso, Boolean estado, String proveedor, Double volumen, String fechaIngreso, Boolean aplicaDescuento, String fechaVencimiento) {

        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.clasificacion = clasificacion;
        this.marca = marca;
        this.presentacion = presentacion;
        this.peso = peso;
        this.estado = estado;
        this.proveedor = proveedor;
        this.volumen = volumen;
        this.fechaIngreso = fechaIngreso;
        this.aplicaDescuento = aplicaDescuento;
        this.fechaVencimiento = fechaVencimiento;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Boolean getAplicaDescuento() {
        return aplicaDescuento;
    }

    public void setAplicaDescuento(Boolean aplicaDescuento) {
        this.aplicaDescuento = aplicaDescuento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
