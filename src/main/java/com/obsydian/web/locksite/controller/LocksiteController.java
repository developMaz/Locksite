package com.obsydian.web.locksite.controller;

import com.obsydian.web.locksite.code.code.CodeCreator;
import com.obsydian.web.locksite.code.controller.CodeController;
import com.obsydian.web.locksite.code.dto.CodeDTO;
import com.obsydian.web.locksite.code.exceptions.CodeNotFoundException;
import com.obsydian.web.locksite.code.mapper.CodeMapper;
import com.obsydian.web.locksite.code.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping
public class LocksiteController {

	@Autowired
	private CodeController databaseController;

	@Autowired
	private CodeService databaseService;

	@Autowired
	private CodeMapper databaseMapper;

	@RequestMapping("/")
	public String showIndex(Model theModel){
		theModel.addAttribute("theDate", new java.util.Date());
		return "index";
	}

	@RequestMapping("/homepage")
	public String newComment(){
		return "homepage";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/addCommentForm")
	public String addCommentForm(Model model){
		CodeDTO codeDTO = new CodeDTO();
		model.addAttribute("newComment", codeDTO);
		return "add-comment-form";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addComment")
	public String addComment(@ModelAttribute("newComment") CodeDTO newComment) {
		databaseController.saveCode(newComment);
		return "redirect:/showAllCodes";
	}

	@RequestMapping("/showAllCodes")
	public String showAllCodes(Model theModel){
		theModel.addAttribute("codes", databaseController.getAllCodes());
		return "codes";
	}

	@RequestMapping(method = RequestMethod.GET, value = "updateCommentForm")
	public String updateCommentForm(@RequestParam("id") Integer code, Model model) throws CodeNotFoundException {

		CodeDTO codeDTO = databaseController.getCode(code);
		model.addAttribute("codeDTO", codeDTO);
		return "add-comment-form";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/generateCode")
	public String generateCode() {
		CodeCreator codeCreator = new CodeCreator();
		databaseService.saveCode(databaseMapper.mapToCode(codeCreator.codeCreator()));
		return "redirect:/showAllCodes";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/deleteCodeForm")
	public String deleteCodeForm(@RequestParam("id") Integer id) throws CodeNotFoundException{
		databaseController.deleteCode(id);
		return "redirect:/showAllCodes";
	}

}

