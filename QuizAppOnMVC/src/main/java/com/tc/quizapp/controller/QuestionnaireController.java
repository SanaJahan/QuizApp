package com.tc.quizapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tc.quizapp.model.Player;
import com.tc.quizapp.model.QuizSubmission;
import com.tc.quizapp.service.Questionnaire;


@Controller
public class QuestionnaireController 
{
	@Autowired
	private Questionnaire questionnaire;
	
	@RequestMapping("/")
	public String welComePageView(ModelMap model) 
	{
		model.addAttribute("quiz", "VS Quiz Application");
		
		return "index";
	}

	@GetMapping("/play")
	@Valid
	public String takeNameFromUser(ModelMap model,
			@RequestParam(value = "playername", defaultValue = "Guest") String playername, HttpServletRequest request,
			@ModelAttribute(value = "ans")  QuizSubmission ans) 
	{
		
		
		//List<QuestionModel> questions = HardCodeQA.hardCodeQues();
		
		
		if (playername != null) 
		{
			// create player object and set the name
			Player player = new Player();
			player.setName(playername);
			model.addAttribute("playerName", player.getName());
			//model.addAttribute("questions", questions);
			model.put("question", questionnaire.getAllQues());

		}
		
		else 
		{
			model.addAttribute("playerName", "Please enter your name to play");

		}	
		return "Play";
	}
}