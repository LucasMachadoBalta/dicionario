package br.com.sambaqui.dicionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sambaqui.dicionario.model.VocabuloModel;

public interface VocabuloRepository extends JpaRepository<VocabuloModel, Long> {

}
