package com.tc.quizapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tc.quizapp.model.QuestionModel;

@Service
public interface CrudServiceInterface 
{	
	public List<QuestionModel> getQuestionBank();
	public void addQuestion(String ques, List<String> opt, int answer);
	public void editQuestion(int id, String ques, List<String> opt, int answer);
	public void deleteQuestion(int id);
}
