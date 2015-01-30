package com.ezreb.speech.dictionary.wordType;

import org.json.JSONObject;

import com.ezreb.speech.dictionary.tenses.VerbTense;

public class Verb implements Word {

	public Verb(String baseWord, VerbTense tenses) {
		this.baseWord = baseWord;
		this.tenses = tenses;
	}
	public String baseWord;
	public VerbTense tenses;
	@Override
	public String getTransWord() {
		return baseWord;
	}
	@Override
	public JSONObject getJSON() {
		// TODO Auto-generated method stub
		return tenses;
	}

}
