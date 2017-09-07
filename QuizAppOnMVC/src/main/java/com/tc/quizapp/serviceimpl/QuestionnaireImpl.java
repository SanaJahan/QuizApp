package com.tc.quizapp.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tc.quizapp.dao.QuestionRepository;
import com.tc.quizapp.model.QuestionModel;
import com.tc.quizapp.service.Questionnaire;

@Service
@Transactional
public class QuestionnaireImpl implements Questionnaire{

	List<QuestionModel> quesList = new ArrayList<QuestionModel>();
	

	private static final Logger log = LoggerFactory.getLogger(CrudServiceImpl.class);
	
	
    @Autowired
    QuestionRepository questionRepository;
    
    // get all questions
    	
    public Iterable<QuestionModel> getAllQues() {
    		quesList = (List<QuestionModel>) questionRepository.findAll();

    		log.info("Printing question list info.");
    		for (QuestionModel qu : quesList) {
    			log.info("Question details : " + qu);
    		}

    		return quesList;
    	}

	@Override
	public void addQuesandAns(List<QuestionModel> q) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashMap<String, Integer> getAllQuesAns() {
		// TODO Auto-generated method stub
		return null;
	}
        

	/*public void addQuesandAns(List<QuestionModel> q) {
		 
        for (QuestionModel ques : q) {
            map.put(ques.getQuestion(), ques.getAnswer());
        }
		
	}*/

	

	

}
