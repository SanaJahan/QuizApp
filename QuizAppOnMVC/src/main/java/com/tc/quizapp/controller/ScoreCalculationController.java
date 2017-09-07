package com.tc.quizapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.tc.quizapp.model.QuizSubmission;

@Controller
public class ScoreCalculationController {

	@GetMapping("/score")
	public String displayResult(ModelMap model, HttpServletRequest request,
			@ModelAttribute(value = "ans") QuizSubmission ans) {

		//List<QuestionModel> questions = HardCodeQA.hardCodeQues();

		List<Integer> index = new ArrayList<Integer>();
		if (ans != null && ans.getAns() != null) {

			for (int i = 1; i < ans.getAns().size(); i++) {
				String userAns = ans.getAns().get(i);
				System.out.println("User Ans is : " + userAns);
				Integer userAnsInt = null;
				if (userAns != null && !userAns.isEmpty()) {

					userAnsInt = Integer.parseInt(userAns);
				} else {
					userAnsInt = 99999;
					
				}

				System.out.println("Ans : " + userAnsInt);

				// Store the answer
				if (userAns != null)
					index.add(userAnsInt);
				else
					index.add(99999);
			}

			// setting user answer
			ans.setAnsInt(index);
			//ScoreCalculationImpl sc = new ScoreCalculationImpl();
			//int score = sc.scoreCalculation(questions, ans);
			//System.out.println("Score is : " + score);
			//model.addAttribute("result", score);
		}
		return "Result";
	}
}