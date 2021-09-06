package cundi.edu.co.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cundi.edu.co.demo.dto.EstudianteDto;
import cundi.edu.co.demo.exception.ModelNotFoundException;
import cundi.edu.co.demo.service.IEstudianteService;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

	@Autowired
	private IEstudianteService service;
	
	//@RequestMapping(value = "/obtener", method = RequestMethod.GET)
	@GetMapping(value = "/obtener/{i}" ,produces = "application/json")
	public ResponseEntity<?> retonar(@PathVariable int i) throws ModelNotFoundException, Exception {
		EstudianteDto estudiante = service.retornar(i);
		return new ResponseEntity<EstudianteDto>(estudiante, HttpStatus.OK);	
		//return ResponseEntity.ok(est);
	}
	
	@PostMapping(value = "/insertar", consumes = "application/json")
	public ResponseEntity<?> guardar(@RequestBody EstudianteDto estudiante) {
		EstudianteDto est  = new EstudianteDto("Johans", "Gonzalez");
		return new ResponseEntity<Object>(HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/editar", consumes = "application/json")
	public ResponseEntity<?> editar(@RequestBody EstudianteDto estudiante) {
		EstudianteDto est  = new EstudianteDto("Johans", "Gonzalez");
		return new ResponseEntity<Object>(HttpStatus.OK);
	}	
	
	//204
	@DeleteMapping(value = "/eliminar/{i}")
	public ResponseEntity<?> eliminar(@PathVariable int i) {
		EstudianteDto est  = new EstudianteDto("Johans", "Gonzalez " + i);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}	
	
	@DeleteMapping(value = "/eliminarHeader/{i}")
	public ResponseEntity<?> eliminarConHeader(@PathVariable int i) {
		EstudianteDto est  = new EstudianteDto("Johans", "Gonzalez " + i);
		HttpHeaders header = new HttpHeaders();
		header.add("info1", "valor 1");
		header.add("info2", "valor 2");
		return new ResponseEntity<Object>(header, HttpStatus.NO_CONTENT);
	}	
	
}
