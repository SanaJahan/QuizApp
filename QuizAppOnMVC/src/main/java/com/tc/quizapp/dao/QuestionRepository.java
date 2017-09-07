package com.tc.quizapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tc.quizapp.model.QuestionModel;


@Repository
public interface QuestionRepository extends CrudRepository<QuestionModel, Long> {

	
	
}
