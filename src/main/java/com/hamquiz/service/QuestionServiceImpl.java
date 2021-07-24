package com.hamquiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hamquiz.entity.Question;
import com.hamquiz.repository.QuestionMapper;

@Transactional
@Service("QuestionServiceImpl")
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionMapper questionMapper;

	@Override
    public Question selectOne(int id) {
        //select実行
        return questionMapper.selectOne(id);
    }

    @Override
    public List<Question> selectMany() {
        //select実行
        return questionMapper.selectMany();
    }

    @Override
    public int countQuiz() {
    	return questionMapper.countQuiz();
    }

    @Override
    public int insertQuiz(List<Integer> id) {
    	//insert実行
    	return questionMapper.insertQuiz(id);
    }


    @Override
    public int deleteQuiz() {
    	//delete実行
    	return questionMapper.deleteQuiz();
    }

    @Override
    public int countMyquiz() {
    	return questionMapper.countMyquiz();
    }

    @Override
    public List<Integer> idQuiz(){
    	return questionMapper.idQuiz();
    }

    @Override
    public int reviewQuiz(int id) {
    	return questionMapper.reviewQuiz(id);
    }

    @Override
    public int answeredQuiz(int id) {
    	return questionMapper.answeredQuiz(id);
    }

    @Override
    public int countReview() {
    	return questionMapper.countReview();
    }
}