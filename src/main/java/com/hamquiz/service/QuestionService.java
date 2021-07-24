package com.hamquiz.service;

import java.util.List;

import com.hamquiz.entity.Question;

public interface QuestionService {

    public Question selectOne(int id);

    public List<Question> selectMany();

    public int countQuiz();

    public int insertQuiz(List<Integer> id);

    public int deleteQuiz();

    public int countMyquiz();

    public List<Integer> idQuiz();

    public int reviewQuiz(int id);

    public int answeredQuiz(int id);

    public int countReview();

}
