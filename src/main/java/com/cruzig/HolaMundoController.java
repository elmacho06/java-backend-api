package com.cruzig;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HolaMundoController {
	@RequestMapping("/saludar")
public String saludar() {
	return "hola mundo desde spring boot";
}
	@RequestMapping("/persona")
	public List<persona> getpersonas() {
		List<persona> personas = new ArrayList<persona>();
		persona p1=new persona();
		p1.setId(1);
		p1.setNombre("juan");
		p1.setApellidos("vazquez");
		p1.setTelefono("12345678");
		personas.add(p1);
		persona p2=new persona();
		p1.setId(1);
		p1.setNombre("melvin");
		p1.setApellidos("hernandez");
		p1.setTelefono("12345678");
		personas.add(p1);
		
		
		return personas;
		

	}


}
