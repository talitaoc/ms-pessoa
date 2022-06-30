package br.com.pessoa.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.pessoa.model.Pessoa;
import br.com.pessoa.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PessoaService {
	
	private final PessoaRepository pessoaRepository;

	public Optional<Pessoa> findById(Long id) {
		
		return pessoaRepository.findById(id);
	}
}
