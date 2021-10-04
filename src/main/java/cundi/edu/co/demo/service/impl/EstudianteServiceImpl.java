package cundi.edu.co.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import cundi.edu.co.demo.dto.EstudianteDto;
import cundi.edu.co.demo.entity.Estudiante;
import cundi.edu.co.demo.exception.ModelNotFoundException;
import cundi.edu.co.demo.repository.IEstudianteRepo;
import cundi.edu.co.demo.service.IEstudianteService;


@Service
public class EstudianteServiceImpl implements IEstudianteService{

	
	@Autowired
	private IEstudianteRepo repo;
	
	//No se usa, solo para el ejemplo
	@Override
	public List<Estudiante> retornarTodo() {
		return repo.findAll();
	}	
	
	@Override
	public Page<Estudiante> retornarPaginado(int page, int size) {
		return repo.findAll(PageRequest.of(page,size));
	}	
	
	@Override
	public Page<Estudiante> retornarPaginado(Pageable page) {
		return repo.findAll(page);
	}	
	
	
	@Override
	public Estudiante retonarPorId(Integer idEstudiante) throws ModelNotFoundException {
		//return estudiante.isPresent() ? estudiante.get() : new Estudiante();
		/*Optional<Estudiante> estudiante = repo.findById(idEstudiante);
		if(estudiante.isPresent()) {
			return estudiante.get();
		} else {
			throw new ModelNotFoundException("Estudiante no encontrado");
		}*/
		return repo.findById(idEstudiante).orElseThrow(() -> new ModelNotFoundException("Estudiante no encontrado")); 
	}	
	
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
	public void guardar(Estudiante estudiante) {
		//Estudiante estu = this.repo.save(estudiante);
		//return estu;
		 this.repo.save(estudiante);
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
