package com.tc.quizapp.serviceimpl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tc.quizapp.model.OptionModel;
import com.tc.quizapp.model.QuestionModel;
import com.tc.quizapp.model.QuizSubmission;
import com.tc.quizapp.service.Questionnaire;
import com.tc.quizapp.service.ScoreCalculation;

@Service
public class ScoreCalculationImpl implements ScoreCalculation {
	
	@Autowired
	Questionnaire questionnaire;
	
	

	//public ScoreCalculationImpl(Questionnaire questionnaire) 
	//{
		//this.questionnaire = questionnaire;
	//}

	
	
	/*calculate the score
	public int scoreCalculation(List<QuestionModel> ques,QuizSubmission user) {
		int result = 0;
		for(int j = 0 ; j < ques.size();j++) {
			
			int ans = ques.get(j).getCorrectAnswer();
			if( ans == user.getAnsInt().get(j)) 
			{
				result++;
			}
			
		}
		return result;
		
	}*/
	
	
	
	
	
	
	
	// initialize the service
	public void initIt() throws Exception {
	       System.out.println("Score Calculation Class Initialised");
	   }
	
	public void cleanUp() throws Exception {
	       System.out.println("Spring Container is destroyed!");
	     }



	public int scoreCalculation(List<QuestionModel> ques) {
		// TODO Auto-generated method stub
		return 0;
	}



	public int scoreCalculation(List<QuestionModel> ques, List<QuizSubmission> user) {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
