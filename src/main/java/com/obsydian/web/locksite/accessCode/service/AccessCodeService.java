package com.obsydian.web.locksite.code.service;

import com.obsydian.web.locksite.code.code.Code;
import com.obsydian.web.locksite.code.repository.CodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CodeService {

	@Autowired
	private CodeRepository codeRepository;

	public List<Code> getAllCodes(){
		return codeRepository.findAllByOrderByAccessCodeAsc();
	}

	public Optional<Code> getCode(final Integer id){
		return codeRepository.findById(id);
	}

	public Optional<Code> getCodeById(final Integer id){
		return codeRepository.findById(id);
	}

	public void deleteCode(final Code code){
		codeRepository.delete(code);
	}

	public Code saveCode(final Code code){
		return codeRepository.save(code);
	}


}
