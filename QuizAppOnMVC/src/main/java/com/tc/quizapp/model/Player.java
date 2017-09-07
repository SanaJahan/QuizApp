package com.tc.quizapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//import com.sun.istack.internal.NotNull;

@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long p_id;
	
	private String name;
	
	private int score;
	public long getP_id() {
		return p_id;
	}

	public void setP_id(long p_id) {
		this.p_id = p_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
