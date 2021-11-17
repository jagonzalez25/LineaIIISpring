package cundi.edu.co.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import cundi.edu.co.demo.entity.Autor;
import cundi.edu.co.demo.exception.ModelNotFoundException;
import cundi.edu.co.demo.service.IAutorService;

@SpringBootTest
class LineaIiiApplicationTests {

	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	@Autowired
	private IAutorService autorService;
	
	
	@Test
	void vaerificarClave() {
		System.out.println("Resultado:--------------------  " + bcrypt.encode("123456"));
		assertTrue(true);
	}

}
