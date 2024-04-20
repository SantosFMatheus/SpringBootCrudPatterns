package com.finan.orcamento.model;

public class CasaModel {
    private Long id;
    private String endereco;
    private int quartos;
    private double preco;

    private CasaModel(Builder builder) {
        this.id = builder.id;
        this.endereco = builder.endereco;
        this.quartos = builder.quartos;
        this.preco = builder.preco;
    }

    public Long getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getQuartos() {
        return quartos;
    }

    public double getPreco() {
        return preco;
    }

    public static class Builder {
        private Long id;
        private String endereco;
        private int quartos;
        private double preco;

        public Builder() {
        }

        public Builder(CasaModel casaExistente) {
            this.id = casaExistente.getId();
            this.endereco = casaExistente.getEndereco();
            this.quartos = casaExistente.getQuartos();
            this.preco = casaExistente.getPreco();
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder endereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public Builder quartos(int quartos) {
            this.quartos = quartos;
            return this;
        }

        public Builder preco(double preco) {
            this.preco = preco;
            return this;
        }

        public CasaModel build() {
            return new CasaModel(this);
        }
    }
}
