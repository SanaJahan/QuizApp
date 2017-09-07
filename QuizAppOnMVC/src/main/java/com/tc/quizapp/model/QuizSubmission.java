package com.tc.quizapp.model;

import java.util.List;

public class QuizSubmission 
{
	private List<String> ans;
	private List<Integer> ansInt;
	public List<Integer> getAnsInt() {
		return ansInt;
	}

	public void setAnsInt(List<Integer> ansInt) {
		this.ansInt = ansInt;
	}

	public List<String> getAns() {
		return ans;
	}

	public void setAns(List<String> ans) {
		this.ans = ans;
	}
}