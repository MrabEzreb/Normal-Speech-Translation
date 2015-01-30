package com.ezreb.speech.dictionary.wordType;

import org.json.JSONObject;

public class Noun implements Word {

	public Noun(String baseWord) {
		this.baseWord = baseWord;
	}
	public String baseWord;
	@Override
	public String getTransWord() {
		// TODO Auto-generated method stub
		return baseWord;
	}
	@Override
	public JSONObject getJSON() {
		// TODO Auto-generated method stub
		return null;
	}

}
