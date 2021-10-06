package cundi.edu.co.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cundi.edu.co.demo.dto.EstudianteDto;
import cundi.edu.co.demo.entity.Estudiante;
import cundi.edu.co.demo.exception.ArgumentRequiredException;
import cundi.edu.co.demo.exception.ConflictException;
import cundi.edu.co.demo.exception.ModelNotFoundException;

public interface IEstudianteService {

	public List<Estudiante> retornarTodo();
	
	public Page<Estudiante> retornarPaginado(int page, int size);
	
	public Page<Estudiante> retornarPaginado(Pageable page);
	
	public Estudiante retonarPorId(Integer idEstudiante) throws ModelNotFoundException;
	
	public EstudianteDto retornar(int i) throws ModelNotFoundException, Exception;
	
	public void guardar(Estudiante estudiante)  throws ConflictException;
	
	public void editar(Estudiante estudiante)  throws ArgumentRequiredException, ModelNotFoundException, ConflictException;
	
	public void eliminar(int idEstudiante) throws ModelNotFoundException;
}
