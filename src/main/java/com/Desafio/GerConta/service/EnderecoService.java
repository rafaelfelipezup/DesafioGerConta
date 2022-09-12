package com.Desafio.GerConta.service;

import com.Desafio.GerConta.model.EnderecoModel;
import com.Desafio.GerConta.model.UsuarioModel;
import com.Desafio.GerConta.repository.EnderecoRepository;
import com.Desafio.GerConta.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<EnderecoModel> buscarEnderecos(){

        return enderecoRepository.findAll();
    }

    public Optional<EnderecoModel> buscarEndId(Long id){

        return enderecoRepository.findById(id);
    }

    public EnderecoModel cadastraEndereco(EnderecoModel enderecoModel){

        return enderecoRepository.save(enderecoModel);
    }

    public EnderecoModel alteraCadEndereco (EnderecoModel enderecoModel){

        return enderecoRepository.save(enderecoModel);
    }

    public void deletaEndereco(Long id){

        enderecoRepository.deleteById(id);
    }
}
