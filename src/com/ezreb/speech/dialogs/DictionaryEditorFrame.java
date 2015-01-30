package com.ezreb.speech.dialogs;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.json.JSONObject;

import com.ezreb.speech.images.ImageLoader;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import java.awt.Cursor;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JProgressBar;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class DictionaryEditorFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DictionaryEditorFrame frame = new DictionaryEditorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DictionaryEditorFrame() {
		setTitle("Dictionary Editor");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		int x = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-240;
		int y = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-150;
		setBounds(x, y, 480, 300);
		this.setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBounds(x, y, 480, 300);
		setIconImage(ImageLoader.DICTIONARY_ICON);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(new Rectangle(0, 0, 480, 300));
		scrollPane.setBounds(0, 0, 480, 300);
		scrollPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(10, 1, 0, 0));
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.GREEN);
		progressBar.setStringPainted(true);
		progressBar.setString("Amount of Dictionary Completed");
		progressBar.setPreferredSize(new Dimension(480, 25));
		progressBar.setBounds(new Rectangle(0, 0, 480, 25));
		progressBar.setSize(480, 25);
		scrollPane.setColumnHeaderView(progressBar);
	}
	
	public DictionaryEditorFrame(JSONObject dict) {
		this();
		this.currentDictionary = dict;
	}
	JSONObject currentDictionary = new JSONObject();
}
