package br.com.joshua.interceptorbasic.entity.person.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonRespose {
	private String id;
    private String name;
    private int age;
}
