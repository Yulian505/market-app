package com.tecdesoftware.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "compras_productos")

public class CompraProducto {

    @EmbeddedId //viene de nuestra clase CompraProductoPk
    private CompraProductoPK id;

    private Integer idCompra;
    private Double total;
    private Boolean estado;

    // Relación con Compra
    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    // Relación con Producto
    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    public CompraProductoPK getId() {
        return id;
    }

    public void setId(CompraProductoPK id) {
        this.id = id;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
