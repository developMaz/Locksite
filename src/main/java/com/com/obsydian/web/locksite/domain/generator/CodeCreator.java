package com.com.obsydian.web.locksite.domain.generator;

import com.com.obsydian.web.locksite.domain.Code;
import com.com.obsydian.web.locksite.dto.CodeDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CodeCreator extends Code{

	private CodeGenerator generator = new CodeGenerator();
	private int generatedAccessCode = generator.generateCode();

	public CodeDTO codeCreator() {
		return new CodeDTO(generatedAccessCode);
	}
}
