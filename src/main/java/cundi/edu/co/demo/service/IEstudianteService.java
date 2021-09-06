package cundi.edu.co.demo.service;

import cundi.edu.co.demo.dto.EstudianteDto;
import cundi.edu.co.demo.exception.ModelNotFoundException;

public interface IEstudianteService {

	public EstudianteDto retornar(int i) throws ModelNotFoundException, Exception;
	
	public void guardar(EstudianteDto estudiante);
	
	public void editar(EstudianteDto estudiante);
	
	public void eliminar(int i);
}
