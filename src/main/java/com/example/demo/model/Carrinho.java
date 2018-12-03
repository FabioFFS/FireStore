
package com.example.demo.model;

import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Carrinho {
    private long id;
    private Collection<Produto> produtos;
    private Date expireTime;
    private Cliente cliente;
    
    
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name="produtos")
    public Collection<Produto> getProdutos() {
        return produtos;
    }


    public void setProdutos(Collection<Produto> produtos) {
        this.produtos = produtos;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    
    public Date getExpireTime() {
        return expireTime;
    }

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="cliente")
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @param expireTime the expireTime to set
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
