package com.tc.quizapp.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tc.quizapp.dao.OptionsRepository;
import com.tc.quizapp.dao.QuestionRepository;
import com.tc.quizapp.model.OptionModel;
import com.tc.quizapp.model.QuestionModel;
import com.tc.quizapp.service.CrudServiceInterface;
@Service
public class CrudServiceImpl implements CrudServiceInterface
{
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private OptionsRepository optionRepository;
	

	private static final Logger log = LoggerFactory.getLogger(CrudServiceImpl.class);
	
	
// Add questions taken from the user
	public void addQuestion(String ques, List<String> opt, String answer) 
	{
		QuestionModel question = new QuestionModel();
		OptionModel option = new OptionModel();
		question.setQuestion(ques);
		
		option.setAnswer(answer);
		questionRepository.save(question);
		optionRepository.save(option);
		
	}
	
	public boolean doesQuestionExist(Long id)
	{		
		if(questionRepository.findOne(id) != null)
		{
			return true;
		}
		else 
			return false;
	}
	
	public void editQuestion(Long id, String ques, List<String> opt, String answer) 
	{
		QuestionModel q = questionRepository.findOne(id);
		q.setQuestion(ques);
		// on the basis of this q_id we find the corresponding option_id
		//OptionModel opt = optionRepository.findOptionById(id);
		
		
		//q.setAnswer(answer);
		//q.setOption(opt);
		
		questionRepository.save(q);
	}
	public void deleteQuestion(Long id) 
	{ 
		/*int index = 0;
		for(int j=0;j<questionBank.size();j++)
		{
			QuestionModel q = questionBank.get(j);
			 int var =  q.getQid().intValue();
			if (var == (id)) {
				// found, delete.
				index = j;
			}
		}
		questionBank.remove(index);*/
	}

	@Override
	public List<QuestionModel> getQuestionBank() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addQuestion(String ques, List<String> opt, int answer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editQuestion(int id, String ques, List<String> opt, int answer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteQuestion(int id) {
		// TODO Auto-generated method stub
		
	}
}
