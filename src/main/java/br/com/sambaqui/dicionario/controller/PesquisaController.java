package br.com.sambaqui.dicionario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sambaqui.dicionario.dto.VocabuloDto;
import br.com.sambaqui.dicionario.model.VocabuloModel;
import br.com.sambaqui.dicionario.repository.VocabuloRepository;

@RestController
public class PesquisaController {
	
	@Autowired
	private VocabuloRepository vocabuloRepository;
	
	@RequestMapping("/pesquisa")
	public List<VocabuloDto> lista(String pesquisa) {
		List<VocabuloModel> vocabulos = vocabuloRepository.findAll();
		return VocabuloDto.converter(vocabulos);
	}
	
//	@PostMapping()
	
}
