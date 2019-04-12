package com.obsydian.web.locksite.code.controller;

import com.obsydian.web.locksite.code.code.CodeCreator;
import com.obsydian.web.locksite.code.dto.CodeDTO;
import com.obsydian.web.locksite.code.exceptions.CodeNotFoundException;
import com.obsydian.web.locksite.code.mapper.CodeMapper;
import com.obsydian.web.locksite.code.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/access/")
public class CodeController {

	@Autowired
	private CodeService codeService;

	@Autowired
	private CodeMapper codeMapper;

	// CRUD FOR CODE
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.GET}, value = "createCode")
	public void createCode() {
		CodeCreator codeCreator = new CodeCreator();
		codeService.saveCode(codeMapper.mapToCode(codeCreator.codeCreator()));
	}

	@RequestMapping(method = RequestMethod.POST, value = "saveCode")
	public void saveCode(@RequestBody CodeDTO codeDTO) {
		codeService.saveCode(codeMapper.mapToCode(codeDTO));
	}

	@RequestMapping(method = RequestMethod.GET, value = "getAllCodes")
	public List<CodeDTO> getAllCodes(){
		return codeMapper.mapToCodeListDTO(codeService.getAllCodes());
	}

	@RequestMapping(method = RequestMethod.GET, value = "getCode")
	public CodeDTO getCode(@RequestParam Integer id) throws CodeNotFoundException {
		return codeMapper.mapToCodeDTO(codeService.getCode(id).orElseThrow(CodeNotFoundException::new));
	}

	@RequestMapping(method = RequestMethod.PUT, value = "updateCode")
	public CodeDTO updateCode(@RequestBody CodeDTO codeDTO){
		return codeMapper.mapToCodeDTO(codeService.saveCode(codeMapper.mapToCode(codeDTO)));
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "deleteCode")
	public void deleteCode(@RequestParam  Integer id) throws CodeNotFoundException{
		codeService.deleteCode(codeService.getCode(id).orElseThrow());
	}


}
