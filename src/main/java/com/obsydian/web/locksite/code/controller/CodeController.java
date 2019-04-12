package com.obsydian.web.locksite.controller;

import com.obsydian.web.locksite.domain.code.CodeCreator;
import com.obsydian.web.locksite.dto.CodeDTO;
import com.obsydian.web.locksite.exceptions.CodeNotFoundException;
import com.obsydian.web.locksite.mapper.DatabaseMapper;
import com.obsydian.web.locksite.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class DatabaseController {

	@Autowired
	DatabaseService databaseService;

	@Autowired
	DatabaseMapper databaseMapper;

	// CRUD FOR CODE
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.GET}, value = "createCode")
	public void createCode() {
		CodeCreator codeCreator = new CodeCreator();
		databaseService.saveCode(databaseMapper.mapToCode(codeCreator.codeCreator()));
	}

	@RequestMapping(method = RequestMethod.POST, value = "saveCode")
	public void saveCode(@RequestBody CodeDTO codeDTO) {
		databaseService.saveCode(databaseMapper.mapToCode(codeDTO));
	}

	@RequestMapping(method = RequestMethod.GET, value = "getAllCodes")
	public List<CodeDTO> getAllCodes(){
		return databaseMapper.mapToCodeListDTO(databaseService.getAllCodes());
	}

	@RequestMapping(method = RequestMethod.GET, value = "getCode")
	public CodeDTO getCode(@RequestParam Integer id) throws CodeNotFoundException {
		return databaseMapper.mapToCodeDTO(databaseService.getCode(id).orElseThrow(CodeNotFoundException::new));
	}

	@RequestMapping(method = RequestMethod.PUT, value = "updateCode")
	public CodeDTO updateCode(@RequestBody CodeDTO codeDTO){
		return databaseMapper.mapToCodeDTO(databaseService.saveCode(databaseMapper.mapToCode(codeDTO)));
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "deleteCode")
	public void deleteCode(@RequestParam  Integer id) throws CodeNotFoundException{
		databaseService.deleteCode(databaseService.getCode(id).orElseThrow());
	}


}
