package br.com.joshua.interceptorbasic.entity.person.port;

public interface SavePersonPort <IN, OUT> {

	OUT execute(IN in);
	
}
