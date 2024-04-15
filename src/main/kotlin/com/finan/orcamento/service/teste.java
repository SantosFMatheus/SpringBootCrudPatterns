package com.finan.orcamento.service;

import com.finan.orcamento.model.OrcamentoModel;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class teste {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(teste.class, args);
        OrcamentoService orcamentoService = context.getBean(OrcamentoService.class);

        Long id = 1L;

        OrcamentoModel orcamentoModel = orcamentoService.buscaId(id);

        System.out.println(orcamentoModel.getValorOrcamento());
        System.out.println(orcamentoModel.getDescontoOrcamento());
        System.out.println(orcamentoModel.getQtdItens());
    }
}
