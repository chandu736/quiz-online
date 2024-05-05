package com.nt.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.nt.springboot.model.Question;

public interface IQuestionService {
	
	Question createQuestion(Question question);
	List<Question> getAllQuestions();
	Optional<Question> getQuestionById(Long id);
	List<String> getAllSubjects();
	Question updateQuestion(Long id, Question question) throws NotFoundException;
	void deleteQuestion(Long id);
	List<Question> getQuestionsFromUser(Integer numOfQuestions, String subject);
}
