package com.obsydian.web.locksite.code.code;

import com.obsydian.web.locksite.code.dto.CodeDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CodeCreator extends Code {

	private CodeGenerator generator = new CodeGenerator();
	private int generatedAccessCode = generator.generateCode();

	public CodeDTO codeCreator() {
		return new CodeDTO(generatedAccessCode);
	}
}
