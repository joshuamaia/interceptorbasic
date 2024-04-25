package br.com.joshua.interceptorbasic.entity.person.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.joshua.interceptorbasic.entity.person.dto.PersonRequest;
import br.com.joshua.interceptorbasic.entity.person.dto.PersonRespose;
import br.com.joshua.interceptorbasic.entity.person.facade.PersonFacade;

@RestController
@RequestMapping("/person")
public class PersonController {

	private final PersonFacade personFacade;

	public PersonController(PersonFacade personFacade) {
		this.personFacade = personFacade;
	}

	@PostMapping
	public ResponseEntity<PersonRespose> savePerson(@RequestBody PersonRequest personRequest) {
		return ResponseEntity.ok(personFacade.savePerson(personRequest));
	}

	@GetMapping
	public ResponseEntity<PersonRespose> findPerson(@RequestParam Integer id) {
		return ResponseEntity.ok(personFacade.findPerson(id));
	}

}
