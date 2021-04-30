package br.com.sambaqui.dicionario.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.sambaqui.dicionario.model.CategoriaGramatical;
import br.com.sambaqui.dicionario.model.LinguaIndigena;
import br.com.sambaqui.dicionario.model.VocabuloModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class VocabuloDto {
	
	private Long id;
	private String palavraPortugues;
	private String palavraIndigena;
	private String frasePortugues;
	private String fraseIndigena;
	private CategoriaGramatical categoriaGramatical;
	private LinguaIndigena linguaIndigena;

	
	public static List<VocabuloDto> converter(List<VocabuloModel> vocabulos) {
		return vocabulos.stream().map(VocabuloDto::transformsToDto).collect(Collectors.toList());
	}

	// model → dto
	public VocabuloDto(VocabuloModel vocabuloModel) {
		super();
		this.id = vocabuloModel.getId();
		this.palavraPortugues = vocabuloModel.getPalavraPortugues();
		this.palavraIndigena = vocabuloModel.getPalavraIndigena();
		this.frasePortugues = vocabuloModel.getFrasePortugues();
		this.fraseIndigena = vocabuloModel.getFraseIndigena();
		this.categoriaGramatical = vocabuloModel.getCategoriaGramatical();
		this.linguaIndigena = vocabuloModel.getLinguaIndigena();
	}
	
	// model → dto
	// padrão mais comum
	public static VocabuloDto transformsToDto(VocabuloModel vocabuloModel) {
        return VocabuloDto.builder()
                .id(vocabuloModel.getId())
                .palavraPortugues(vocabuloModel.getPalavraPortugues())
                .palavraIndigena(vocabuloModel.getPalavraIndigena())
                .frasePortugues(vocabuloModel.getFrasePortugues())
                .fraseIndigena(vocabuloModel.getFraseIndigena())
                .categoriaGramatical(vocabuloModel.getCategoriaGramatical())
                .linguaIndigena(vocabuloModel.getLinguaIndigena())
                .build();
    }

}
