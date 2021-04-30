package br.com.sambaqui.dicionario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vocabulario")
@NoArgsConstructor
@AllArgsConstructor
@Data
//@EqualsAndHashCode(exclude = { "" })
@Builder
public class VocabuloModel {
	
	@Id
	@Column(name = "palavra_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String palavraPortugues;
	private String palavraIndigena;
	private String frasePortugues;
	private String fraseIndigena;
	
	@Enumerated(EnumType.STRING) 
	private CategoriaGramatical categoriaGramatical = CategoriaGramatical.NAO_RESPONDIDO;
	
	@Enumerated(EnumType.STRING)
	private LinguaIndigena linguaIndigena = LinguaIndigena.NAO_RESPONDIDO;
	
}
