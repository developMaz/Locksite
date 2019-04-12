package com.obsydian.web.locksite.code.mapper;

import com.obsydian.web.locksite.code.code.Code;
import com.obsydian.web.locksite.code.dto.CodeDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CodeMapper {


	public Code mapToCode (final CodeDTO codeDTO){
		return new Code(codeDTO.getId(), codeDTO.getAccessCode(),codeDTO.getComment());
	}

	public CodeDTO mapToCodeDTO(final Code code){
		return new CodeDTO(code.getId(), code.getAccessCode(), code.getComment());
	}

	public List<Code> mapToCodeList(final List<CodeDTO> codeDTOList){
		return codeDTOList.stream()
				.map(c -> new Code(c.getId(), c.getAccessCode(), c.getComment()))
				.collect(Collectors.toList());
	}

	public List<CodeDTO> mapToCodeListDTO(final List<Code> codeList){
		return codeList.stream()
				.map(c -> new CodeDTO(c.getId(), c.getAccessCode(), c.getComment()))
				.collect(Collectors.toList());
	}




}
