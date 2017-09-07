package com.tc.quizapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tc.quizapp.model.OptionModel;
import com.tc.quizapp.model.QuestionModel;

@Repository
public interface OptionsRepository extends CrudRepository<OptionModel, Long>
{
	List<OptionModel> findAllByQuestion(QuestionModel questionModel);
}
