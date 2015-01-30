package com.ezreb.speech;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ExportDict {

	public static void exportDict(String name) {
		InputStream in = ExportDict.class.getResourceAsStream("Dictionary/"+name);
		OutputStream out = null;
		new File(System.getProperty("user.dir")+"\\AppData\\Roaming\\Ezreb\\Dictionary").mkdirs();
		try {
			new File(System.getProperty("user.dir")+"\\AppData\\Roaming\\Ezreb\\Dictionary\\"+name).createNewFile();
			out = new FileOutputStream(new File(System.getProperty("user.dir")+"\\AppData\\Roaming\\Ezreb\\Dictionary\\"+name));
			byte[] b = new byte[1];
			while(in.available() > 0) {
				in.read(b);
				out.write(b);
				b = new byte[1];
			}
		} catch(IOException e) {
			System.out.println(e.toString());
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
			try {
				out.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
	}
}
