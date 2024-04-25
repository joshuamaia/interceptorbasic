package br.com.joshua.interceptorbasic.entity.person.facade.impl;

import org.springframework.stereotype.Service;

import br.com.joshua.interceptorbasic.entity.person.dto.PersonRequest;
import br.com.joshua.interceptorbasic.entity.person.dto.PersonRespose;
import br.com.joshua.interceptorbasic.entity.person.facade.PersonFacade;
import br.com.joshua.interceptorbasic.entity.person.port.FindPersonPort;
import br.com.joshua.interceptorbasic.entity.person.port.SavePersonPort;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonFacadeImpl implements PersonFacade {
	
	private final SavePersonPort<PersonRequest, PersonRespose> savePersonPort;
	
	private final FindPersonPort<Integer, PersonRespose> findPersonPort;

	@Override
	public PersonRespose findPerson(Integer in) {
		return findPersonPort.execute(in);
	}

	@Override
	public PersonRespose savePerson(PersonRequest in) {
		return savePersonPort.execute(in);
	}

}
