package com.ezreb.speech.images;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	public static void loadImages() {
		DICTIONARY_ICON = loadImage("dictionary_icon.png");
	}
	private static Image loadImage(String name) {
		try {
			Image retval = ImageIO.read(ImageLoader.class.getResourceAsStream(dir+name));
			return retval;
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		return null;
	}
	private static String dir = "/com/ezreb/speech/images/";
	public static Image DICTIONARY_ICON;
}
