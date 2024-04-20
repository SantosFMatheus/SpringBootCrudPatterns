package com.finan.orcamento.service;

import com.finan.orcamento.model.CasaModel;
import com.finan.orcamento.repositories.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CasaService {
    @Autowired
    private CasaRepository casaRepository;

    public List<CasaModel> buscarCadastro() {
        return casaRepository.findAll();
    }

    public CasaModel buscaId(Long id) {
        Optional<CasaModel> obj = casaRepository.findById(id);
        if (obj.isPresent()) {
            return obj.get();
        } else {
            throw new RuntimeException("Casa não encontrada");
        }
    }

    public CasaModel cadastrarCasa(CasaModel casaModel) {
        return casaRepository.save(casaModel);
    }

    public CasaModel atualizaCasa(CasaModel casaModel, Long id) {
        CasaModel casaExistente = buscaId(id);

        // Criar um novo Builder com base na casa existente e atualizar os atributos
        CasaModel.Builder builder = new CasaModel.Builder(casaExistente)
                .endereco(casaModel.getEndereco())
                .quartos(casaModel.getQuartos())
                .preco(casaModel.getPreco());

        // Construir e salvar a casa atualizada
        return casaRepository.save(builder.build());
    }

    public void deletaCasa(Long id) {
        casaRepository.deleteById(id);
    }
}
