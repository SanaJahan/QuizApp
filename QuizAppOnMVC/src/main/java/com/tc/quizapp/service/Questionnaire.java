package com.tc.quizapp.service;

import java.util.HashMap;
import java.util.List;

import com.tc.quizapp.model.QuestionModel;

public interface Questionnaire {

	public Iterable<QuestionModel> getAllQues();
    void addQuesandAns(List<QuestionModel> q);
    public HashMap<String, Integer> getAllQuesAns();
    
}
