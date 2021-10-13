package cundi.edu.co.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cundi.edu.co.demo.entity.Autor;
import cundi.edu.co.demo.exception.ArgumentRequiredException;
import cundi.edu.co.demo.exception.ConflictException;
import cundi.edu.co.demo.exception.ModelNotFoundException;
import cundi.edu.co.demo.repository.IAutorRepo;
import cundi.edu.co.demo.service.IAutorService;

@Service
public class AutorServiceImpl implements IAutorService {
	
	@Autowired
	private IAutorRepo repo;

	@Override
	public Page<Autor> retornarPaginado(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Autor> retornarPaginado(Pageable page) {
		return repo.findAll(page);
	}

	@Override
	public Autor retonarPorId(Integer idEstudiante) throws ModelNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Autor estudiante) throws ConflictException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Autor estudiante) throws ArgumentRequiredException, ModelNotFoundException, ConflictException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int idEstudiante) throws ModelNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
