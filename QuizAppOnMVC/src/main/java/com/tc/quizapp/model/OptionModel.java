package com.tc.quizapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class OptionModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long optionId;
	
	private String answer;
	
	
	@ManyToOne(targetEntity=QuestionModel.class)
	public QuestionModel question;
	
	
	
	
	public Long getOptionId() {
		return optionId;
	}
	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}
	public QuestionModel getQuestion() {
		return question;
	}
	public void setQuestion(QuestionModel question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
}
