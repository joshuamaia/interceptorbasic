package br.com.joshua.interceptorbasic.entity.person.adapter;

import java.util.UUID;

import org.springframework.stereotype.Component;

import br.com.joshua.interceptorbasic.entity.person.dto.PersonRequest;
import br.com.joshua.interceptorbasic.entity.person.dto.PersonRespose;
import br.com.joshua.interceptorbasic.entity.person.port.SavePersonPort;

@Component
public class SavePersonAdapter implements SavePersonPort<PersonRequest, PersonRespose> {

	@Override
	public PersonRespose execute(PersonRequest in) {
		UUID id = UUID.randomUUID();
		return PersonRespose.builder().id(id.toString()).name(in.getName()).age(in.getAge()).build();
	}

}
