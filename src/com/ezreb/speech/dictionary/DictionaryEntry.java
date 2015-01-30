package com.ezreb.speech.dictionary;

import org.json.JSONObject;

import com.ezreb.speech.dictionary.wordType.Word;



public class DictionaryEntry extends JSONObject {

	public DictionaryEntry(String baseWord, Word meaning) {
		this.word = baseWord;
		this.meaning = meaning;
		put("Word", word);
		put("Meaning", meaning.getTransWord());
		put("Data", meaning.getJSON());
	}
	public String word;
	public Word meaning;
}
