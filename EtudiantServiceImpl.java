package com.akc.tech;

import java.util.List;

import org.springframework.stereotype.Service;


@Service 
public class EtudiantServiceImpl implements EtudiantService {

private final EtudiantRepository repository;

	EtudiantServiceImpl(EtudiantRepository repository) {
		this.repository = repository;
	}
@Override
public List<Etudiant> listeEtudiants() {
	// TODO Auto-generated method stub
	return repository.findAll();
}


}
