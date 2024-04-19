package com.finan.orcamento.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "casa")
public class CasaModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "endereco")
    private String endereco;

    @Column(name = "quartos")
    private int quartos;

    @Column(name = "preco")
    private double preco;

    // Construtores, getters e setters
    public CasaModel(Long id, String endereco, int quartos, double preco) {
        this.id = id;
        this.endereco = endereco;
        this.quartos = quartos;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método toString para facilitar a visualização dos objetos
    @Override
    public String toString() {
        return "CasaModel{" +
                "id=" + id +
                ", endereco='" + endereco + '\'' +
                ", quartos=" + quartos +
                ", preco=" + preco +
                '}';
    }
}
