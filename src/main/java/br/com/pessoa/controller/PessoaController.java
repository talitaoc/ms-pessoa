package br.com.pessoa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pessoa.model.Pessoa;
import br.com.pessoa.service.PessoaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/pessoa")
@RequiredArgsConstructor
public class PessoaController {
	
	private final PessoaService pessoaService;

	@GetMapping("/pessoa/{id}")
	public ResponseEntity<Pessoa> getOne(@PathVariable Long id){
		
		return findById(id);
	}


}
