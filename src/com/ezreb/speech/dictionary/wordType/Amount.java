package com.ezreb.speech.dictionary.wordType;

import org.json.JSONObject;

public class Amount implements Word {

	public Amount(int flag) {
		this.translatedWord = amounts[flag];
	}
	public String translatedWord;
	@Override
	public JSONObject getJSON() {
		// TODO Auto-generated method stub
		return new JSONObject();
	}
	@Override
	public String getTransWord() {
		// TODO Auto-generated method stub
		return this.translatedWord;
	}
	private static String[] amounts = {"Only One", "One", "Multiple", "Some"};
	public static int ONLY = 0;
	public static int ONE = 1;
	public static int MULTIPLE = 2;
	public static int SOME = 3;
}
