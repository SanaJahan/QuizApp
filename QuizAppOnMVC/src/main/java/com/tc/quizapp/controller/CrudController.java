package com.tc.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tc.quizapp.model.QuestionModel;
import com.tc.quizapp.service.CrudServiceInterface;

@Controller
public class CrudController {

	@Autowired
	CrudServiceInterface crud;

	// Go to the CRUD menu page
	@GetMapping("/crudlist")
	public String crud(ModelMap model) {
		return "crud";
	}

	// Go to the add form page
	@GetMapping("/addPage")
	public String add(ModelMap model) {
		return "addForm";
	}

	// go to the edit form page
	@GetMapping("/editPage")
	public String edit(ModelMap model) {
		return "editForm";
	}

	// go to the delete form page
	@GetMapping("/deletePage")
	public String delete(ModelMap model) {
		return "deleteForm";
	}

	// get the parameters from user to add it in the list

	@GetMapping("/add")
	public String add(ModelMap model,
			@RequestParam(value = "question", defaultValue = "Blank Question") String questionText,
			@RequestParam(value = "options") List<String> options, @RequestParam(value = "answer") int answer) {

		crud.addQuestion(questionText, options, answer);
		model.addAttribute("question", questionText);
		model.addAttribute("options", options);
		model.addAttribute("answer", answer);
		return "add";
	}

	// get the parameters from the user to edit it in the list
	@GetMapping("/edit")
	public String edit(ModelMap model, @RequestParam(value = "qid") int id,
			@RequestParam(value = "question", defaultValue = "Blank Question") String questionText,
			@RequestParam(value = "options") List<String> options, @RequestParam(value = "answer") int answer) {

		crud.editQuestion(id, questionText, options, answer);
		model.addAttribute("question", questionText);
		model.addAttribute("options", options);
		model.addAttribute("answer", answer);
		return "edit";
	}

	// get the question id from the user to delete it from the list
	@GetMapping("/delete")
	public String delete(ModelMap model, @RequestParam(value = "qid") String id) {
		System.out.println("id="+id);
		int id1=Integer.parseInt(id);
				if (crud.getQuestionBank().get(id1) == null) {
					// redirect to the failed page
					return "crud";
				}
		crud.deleteQuestion(id1);
		System.out.println(crud.getQuestionBank().get(id1).getQuestion());
		
		return "viewall";

	}

	// view all the questions from the list
	@GetMapping("/viewAll")
	public String viewAll(ModelMap model) {

		if (crud.getQuestionBank().isEmpty()) {
			model.addAttribute("status", "No questions exist");
		} else {
			List<QuestionModel> viewAllQuestions = crud.getQuestionBank();
			model.addAttribute("status", viewAllQuestions);
		}
		return "viewall";
	}
}