package br.com.joshua.interceptorbasic.entity.person.adapter;

import java.util.UUID;

import org.springframework.stereotype.Component;

import br.com.joshua.interceptorbasic.entity.person.dto.PersonRespose;
import br.com.joshua.interceptorbasic.entity.person.port.FindPersonPort;

@Component
public class FindPersonAdapter implements FindPersonPort<Integer, PersonRespose> {

	@Override
	public PersonRespose execute(Integer in) {
		UUID id = UUID.randomUUID();
		return PersonRespose.builder().id(id.toString()).name("Joshua").age(46).build();
	}

}
