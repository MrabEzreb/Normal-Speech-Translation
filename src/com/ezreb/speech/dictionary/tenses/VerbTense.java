package com.ezreb.speech.dictionary.tenses;

import org.json.JSONObject;

public class VerbTense extends JSONObject {

	public VerbTense(String present, String past, String future, String progressivepresent, String progressivepast, String progressivefuture, String perfectpresent, String perfectpast, String perfectfuture, String perfectprogressivepresent, String perfectprogressivepast, String perfectprogressivefuture) {
		put("Present", present);
		put("Past", past);
		put("Future", future);
		
		put("Progressive Present", progressivepresent);
		put("Progressive Past", progressivepast);
		put("Progressive Future", progressivefuture);
		
		put("Perfect Present", perfectpresent);
		put("Perfect Past", perfectpast);
		put("Perfect Future", perfectfuture);
		
		put("Perfect Progressive Present", perfectprogressivepresent);
		put("Perfect Progressive Past", perfectprogressivepast);
		put("Perfect Progressive Future", perfectprogressivefuture);
	}
	public String findWord(String word) {
		if(has("Present")) {return "Present";}
		if(has("Past")) {return "Past";}
		if(has("Future")) {return "Future";}
		
		if(has("Progressive Present")) {return "Progressive Present";}
		if(has("Progressive Past")) {return "Progressive Past";}
		if(has("Progressive Future")) {return "Progressive Future";}
		
		if(has("Perfect Present")) {return "Perfect Present";}
		if(has("Perfect Past")) {return "Perfect Past";}
		if(has("Perfect Future")) {return "Perfect Future";}
		
		if(has("Perfect Progressive Present")) {return "Perfect Progressive Present";}
		if(has("Perfect Progressive Past")) {return "Perfect Progressive Past";}
		if(has("Perfect Progressive Future")) {return "Perfect Progressive Future";}
		return null;
	}
}
