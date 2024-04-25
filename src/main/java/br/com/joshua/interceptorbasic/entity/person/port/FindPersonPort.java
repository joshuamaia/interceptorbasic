package br.com.joshua.interceptorbasic.entity.person.port;

public interface FindPersonPort <IN, OUT> {

	OUT execute(IN in);
	
}
