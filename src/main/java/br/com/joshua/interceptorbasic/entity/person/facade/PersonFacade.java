package br.com.joshua.interceptorbasic.entity.person.facade;

import br.com.joshua.interceptorbasic.entity.person.dto.PersonRequest;
import br.com.joshua.interceptorbasic.entity.person.dto.PersonRespose;

public interface PersonFacade {

	PersonRespose findPerson(Integer in);
	
	PersonRespose savePerson(PersonRequest in);
	
}
