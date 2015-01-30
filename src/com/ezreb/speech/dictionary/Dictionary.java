package com.ezreb.speech.dictionary;

import org.json.JSONException;
import org.json.JSONObject;

import com.ezreb.speech.dictionary.tenses.VerbTense;
import com.ezreb.speech.dictionary.wordType.Amount;
import com.ezreb.speech.dictionary.wordType.Noun;
import com.ezreb.speech.dictionary.wordType.Verb;

public class Dictionary {

	public Dictionary() {
		this.json.put("some", new DictionaryEntry("some", new Amount(Amount.SOME)));
		this.json.put("many", new DictionaryEntry("many", new Amount(Amount.SOME)));
		this.json.put("students", new DictionaryEntry("students", new Noun("students")));
		VerbTense likeVerb = new VerbTense("like", "liked", "will like", "am liking", "was liking", "will be liking", "has liked", "had liked", "will have liked", "have been liking", "had been liking", "will have been liking");
		this.json.put("like", new DictionaryEntry("like", new Verb("like", likeVerb)));
	}
	public JSONObject json = new JSONObject();
	public JSONObject searchForWord(String word) {
		JSONObject retVal = new JSONObject();
		if(this.json.has(word)) {
			try {
				retVal = this.json.getJSONObject(word);
			} catch(JSONException je) {
				retVal = new JSONObject();
			}
		}
		return retVal;
	}
}
