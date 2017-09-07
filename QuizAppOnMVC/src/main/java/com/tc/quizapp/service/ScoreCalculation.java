package com.tc.quizapp.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.tc.quizapp.model.QuestionModel;
import com.tc.quizapp.model.QuizSubmission;


@Service
public interface ScoreCalculation {
	
	public int scoreCalculation(List<QuestionModel> ques,List<QuizSubmission> user);
}