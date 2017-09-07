package com.tc.quizapp.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class QuestionModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long qid;

	private String question;

	@OneToOne
	private OptionModel correctAnswer;

	@OneToMany(mappedBy = "question")
	private List<OptionModel> options;

	
	
	public List<OptionModel> getOptions() {
		return options;
	}

	public void setOptions(List<OptionModel> options) {
		this.options = options;
	}

	public OptionModel getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(OptionModel correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public Long getQid() {
		return qid;
	}

	public void setQid(Long qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

}
