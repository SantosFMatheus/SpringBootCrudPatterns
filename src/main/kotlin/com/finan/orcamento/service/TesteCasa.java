package com.finan.orcamento.service;

import com.finan.orcamento.model.CasaModel;

public class TesteCasa{

    public static void main(String[] args) {
        // Criar instância do serviço de Casa
        CasaService casaService = new CasaService();

        // Cadastrar uma nova casa
        CasaModel casa1 = new CasaModel(null, "Rua A", 3, 200000);
        casa1.setEndereco("Rua A");
        casa1.setQuartos(3);
        casa1.setPreco(200000);
        casaService.cadastrarCasa(casa1);

        // Buscar todas as casas cadastradas e exibir
        System.out.println("Casas cadastradas:");
        casaService.buscarCadastro().forEach(System.out::println);

        // Buscar uma casa pelo ID e exibir
        Long idCasa = casa1.getId();
        CasaModel casaEncontrada = casaService.buscaId(idCasa);
        System.out.println("\nCasa encontrada pelo ID:");
        System.out.println(casaEncontrada);

        // Atualizar uma casa existente
        casaEncontrada.setEndereco("Nova Rua");
        casaService.atualizaCasa(casaEncontrada, idCasa);
        System.out.println("\nCasa atualizada:");
        System.out.println(casaService.buscaId(idCasa));

        // Deletar uma casa
        casaService.deletaCasa(idCasa);
        System.out.println("\nCasa deletada");

        // Verificar se a casa foi removida
        System.out.println("\nLista de casas após exclusão:");
        casaService.buscarCadastro().forEach(System.out::println);
    }
}
