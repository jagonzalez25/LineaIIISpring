package cundi.edu.co.demo.service.impl;

import org.springframework.stereotype.Service;

import cundi.edu.co.demo.dto.EstudianteDto;
import cundi.edu.co.demo.exception.ModelNotFoundException;
import cundi.edu.co.demo.service.IEstudianteService;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	/**
	 * @author Johans
	 * @return EstudianteDto
	 * @throws ModelNotFoundException, Exception
	 */
	@Override
	public EstudianteDto retornar(int i) throws ModelNotFoundException, Exception {
		if(i <= 10) {
			EstudianteDto est  = new EstudianteDto("Johans", "Gonzalez " + i);
			throw new Exception("Ejemplo");
			//return est;
		} else {
			try {
				int x = 0;
				throw new ModelNotFoundException("Estudiante no encontrado");
			} catch(ArithmeticException e) {
				throw new ArithmeticException("No se puede dividir por cero");
			} catch(NullPointerException e) {
				throw new NullPointerException("Objeo nulo no asignado");
			} catch(ModelNotFoundException e) {
				throw new ModelNotFoundException(e.getMessage());
			} catch(Exception e) {
				throw new Exception("Error general");
			}
		}
		
	}

	@Override
	public void guardar(EstudianteDto estudiante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(EstudianteDto estudiante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int i) {
		// TODO Auto-generated method stub
		
	}
}
