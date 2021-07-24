package com.hamquiz.entity;

import lombok.Data;

@Data
public class Question {

	private int id;
	private String question;
	private String choice1;
	private String choice2;
	private String choice3;
	private String choice4;
	private int answer;
	private String description;
	private boolean answered;
	private boolean mistake;

}