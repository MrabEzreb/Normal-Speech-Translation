package com.ezreb.speech;

import com.ezreb.speech.dialogs.DictionaryEditorFrame;
import com.ezreb.speech.images.ImageLoader;

public class Main {

	public static void main(String[] args) {
		ImageLoader.loadImages();
		DictionaryEditorFrame frame = new DictionaryEditorFrame();
		frame.setVisible(true);
	}

}
