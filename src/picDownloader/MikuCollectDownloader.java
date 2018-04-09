package picDownloader;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.net.ssl.SSLEngineResult.Status;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.Action;
import javax.swing.JCheckBox;

public class MikuCollectDownloader {

	private JFrame frame;
	private JTextField MIkuPlusLo;
	private JTextField MIkuPlusHi;
	private JTextField MIkuLo;
	private JTextField MIkuHi;
	private JTextField RinPlusLo;
	private JTextField RinPlusHi;
	private JTextField RinLo;
	private JTextField RinHi;
	private JTextField LenPLusLo;
	private JTextField LenPLusHi;
	private JTextField LenLo;
	private JTextField LenHi;
	private JTextField LukaPlusLo;
	private JTextField LukaPlusHi;
	private JTextField LukaLo;
	private JTextField LukaHi;
	private JTextField KaitoPlusLo;
	private JTextField KaitoPlusHi;
	private JTextField MeikoPLusLo;
	private JTextField MeikoPLusHi;
	private JTextField MeikoLo;
	private JTextField MeikoHi;
	private JTextField KaitoSSRLo;
	private JTextField KaitoSSRHi;
	private final Action action = new SwingAction();
	private JCheckBox Miku_SSR_PLUS;
	private JCheckBox Miku_SSR;
	private JCheckBox Rin_SSR_Plus;
	private JCheckBox Rin_SSR;
	private JCheckBox Len_SSR_Plus;
	private JCheckBox Len_SSR;
	private JCheckBox Luka_SSR_Plus;
	private JCheckBox Luka_SSR;
	private JCheckBox Kaito_SSR_Plus;
	private JCheckBox Kaito_SSR;
	private JCheckBox Meiko_SSR_Plus;
	private JCheckBox Meiko_SSR;
	private JCheckBox announce_check;
	private JTextField announce;
	private JLabel status_label ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MikuCollectDownloader window = new MikuCollectDownloader();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MikuCollectDownloader() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton run = new JButton("run");
		run.setAction(action);
		run.setBounds(10, 437, 434, 23);
		frame.getContentPane().add(run);
		
		MIkuPlusLo = new JTextField();
		MIkuPlusLo.setBounds(133, 11, 86, 20);
		frame.getContentPane().add(MIkuPlusLo);
		MIkuPlusLo.setColumns(10);
		
		MIkuPlusHi = new JTextField();
		MIkuPlusHi.setBounds(264, 11, 86, 20);
		frame.getContentPane().add(MIkuPlusHi);
		MIkuPlusHi.setColumns(10);
		
		MIkuLo = new JTextField();
		MIkuLo.setBounds(133, 42, 86, 20);
		frame.getContentPane().add(MIkuLo);
		MIkuLo.setColumns(10);
		
		MIkuHi = new JTextField();
		MIkuHi.setBounds(264, 42, 86, 20);
		frame.getContentPane().add(MIkuHi);
		MIkuHi.setColumns(10);
		
		RinPlusLo = new JTextField();
		RinPlusLo.setBounds(133, 73, 86, 20);
		frame.getContentPane().add(RinPlusLo);
		RinPlusLo.setColumns(10);
		
		RinPlusHi = new JTextField();
		RinPlusHi.setBounds(264, 73, 86, 20);
		frame.getContentPane().add(RinPlusHi);
		RinPlusHi.setColumns(10);
		
		RinLo = new JTextField();
		RinLo.setBounds(133, 104, 86, 20);
		frame.getContentPane().add(RinLo);
		RinLo.setColumns(10);
		
		RinHi = new JTextField();
		RinHi.setBounds(264, 104, 86, 20);
		frame.getContentPane().add(RinHi);
		RinHi.setColumns(10);
		
		LenPLusLo = new JTextField();
		LenPLusLo.setBounds(133, 135, 86, 20);
		frame.getContentPane().add(LenPLusLo);
		LenPLusLo.setColumns(10);
		
		LenPLusHi = new JTextField();
		LenPLusHi.setBounds(264, 135, 86, 20);
		frame.getContentPane().add(LenPLusHi);
		LenPLusHi.setColumns(10);
		
		LenLo = new JTextField();
		LenLo.setBounds(133, 166, 86, 20);
		frame.getContentPane().add(LenLo);
		LenLo.setColumns(10);
		
		LenHi = new JTextField();
		LenHi.setBounds(264, 166, 86, 20);
		frame.getContentPane().add(LenHi);
		LenHi.setColumns(10);
		
		LukaPlusLo = new JTextField();
		LukaPlusLo.setBounds(133, 197, 86, 20);
		frame.getContentPane().add(LukaPlusLo);
		LukaPlusLo.setColumns(10);
		
		LukaPlusHi = new JTextField();
		LukaPlusHi.setBounds(264, 197, 86, 20);
		frame.getContentPane().add(LukaPlusHi);
		LukaPlusHi.setColumns(10);
		
		LukaLo = new JTextField();
		LukaLo.setBounds(133, 228, 86, 20);
		frame.getContentPane().add(LukaLo);
		LukaLo.setColumns(10);
		
		LukaHi = new JTextField();
		LukaHi.setBounds(264, 228, 86, 20);
		frame.getContentPane().add(LukaHi);
		LukaHi.setColumns(10);
		
		KaitoPlusLo = new JTextField();
		KaitoPlusLo.setBounds(133, 259, 86, 20);
		frame.getContentPane().add(KaitoPlusLo);
		KaitoPlusLo.setColumns(10);
		
		KaitoPlusHi = new JTextField();
		KaitoPlusHi.setBounds(264, 259, 86, 20);
		frame.getContentPane().add(KaitoPlusHi);
		KaitoPlusHi.setColumns(10);
		
		MeikoPLusLo = new JTextField();
		MeikoPLusLo.setBounds(133, 321, 86, 20);
		frame.getContentPane().add(MeikoPLusLo);
		MeikoPLusLo.setColumns(10);
		
		MeikoPLusHi = new JTextField();
		MeikoPLusHi.setBounds(264, 321, 86, 20);
		frame.getContentPane().add(MeikoPLusHi);
		MeikoPLusHi.setColumns(10);
		
		MeikoLo = new JTextField();
		MeikoLo.setBounds(133, 352, 86, 20);
		frame.getContentPane().add(MeikoLo);
		MeikoLo.setColumns(10);
		
		MeikoHi = new JTextField();
		MeikoHi.setBounds(264, 352, 86, 20);
		frame.getContentPane().add(MeikoHi);
		MeikoHi.setColumns(10);
		
		KaitoSSRLo = new JTextField();
		KaitoSSRLo.setBounds(133, 290, 86, 20);
		frame.getContentPane().add(KaitoSSRLo);
		KaitoSSRLo.setColumns(10);
		
		KaitoSSRHi = new JTextField();
		KaitoSSRHi.setBounds(264, 290, 86, 20);
		frame.getContentPane().add(KaitoSSRHi);
		KaitoSSRHi.setColumns(10);
		
		Miku_SSR_PLUS = new JCheckBox("Miku SSR+");
		Miku_SSR_PLUS.setBounds(30, 10, 97, 23);
		frame.getContentPane().add(Miku_SSR_PLUS);
		
		Miku_SSR = new JCheckBox("Miku SSR");
		Miku_SSR.setBounds(30, 41, 97, 23);
		frame.getContentPane().add(Miku_SSR);
		
		Rin_SSR_Plus = new JCheckBox("Rin SSR+");
		Rin_SSR_Plus.setBounds(30, 72, 97, 23);
		frame.getContentPane().add(Rin_SSR_Plus);
		
		Rin_SSR = new JCheckBox("Rin SSR");
		Rin_SSR.setBounds(30, 103, 97, 23);
		frame.getContentPane().add(Rin_SSR);
		
		Len_SSR_Plus = new JCheckBox("Len SSR+");
		Len_SSR_Plus.setBounds(30, 134, 97, 23);
		frame.getContentPane().add(Len_SSR_Plus);
		
		Len_SSR = new JCheckBox("Len SSR");
		Len_SSR.setBounds(30, 165, 97, 23);
		frame.getContentPane().add(Len_SSR);
		
		Luka_SSR_Plus = new JCheckBox("Luka SSR+");
		Luka_SSR_Plus.setBounds(30, 196, 97, 23);
		frame.getContentPane().add(Luka_SSR_Plus);
		
		Luka_SSR = new JCheckBox("Luka SSR");
		Luka_SSR.setBounds(30, 227, 97, 23);
		frame.getContentPane().add(Luka_SSR);
		
		Kaito_SSR_Plus = new JCheckBox("Kaito SSR+");
		Kaito_SSR_Plus.setBounds(30, 258, 97, 23);
		frame.getContentPane().add(Kaito_SSR_Plus);
		
		Kaito_SSR = new JCheckBox("Kaito SSR");
		Kaito_SSR.setBounds(30, 289, 97, 23);
		frame.getContentPane().add(Kaito_SSR);
		
		Meiko_SSR_Plus = new JCheckBox("Meiko SSR+");
		Meiko_SSR_Plus.setBounds(30, 320, 97, 23);
		frame.getContentPane().add(Meiko_SSR_Plus);
		
		Meiko_SSR = new JCheckBox("Meiko SSR");
		Meiko_SSR.setBounds(30, 351, 97, 23);
		frame.getContentPane().add(Meiko_SSR);
		
		announce = new JTextField();
		announce.setBounds(133, 383, 86, 20);
		frame.getContentPane().add(announce);
		announce.setColumns(10);
		
		announce_check = new JCheckBox("Announce");
		announce_check.setBounds(30, 382, 97, 23);
		frame.getContentPane().add(announce_check);
		
		status_label = new JLabel(" ");
		status_label.setBounds(30, 412, 97, 14);
		frame.getContentPane().add(status_label);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Run");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
			setUp();
			if(Miku_SSR_PLUS.isSelected()){
				int lo = Integer.parseInt(MIkuPlusLo.getText());
				int hi = Integer.parseInt(MIkuPlusHi.getText());
				try {
					fetch(lo,hi,1080000,"Cards//Miku SSR+");
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(Miku_SSR.isSelected()){
				int lo = Integer.parseInt(MIkuLo.getText());
				int hi = Integer.parseInt(MIkuHi.getText());
				try {
					fetch(lo,hi,1070000,"Cards//Miku SSR");
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			if(Rin_SSR_Plus.isSelected()){
				int hi = Integer.parseInt(RinPlusHi.getText());
				int lo = Integer.parseInt(RinPlusLo.getText());

				try {
					fetch(lo,hi,2080000,"Cards//Rin SSR+");
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			if(Rin_SSR.isSelected()){
				int hi = Integer.parseInt(RinHi.getText());
				int lo = Integer.parseInt(RinLo.getText());

				try {
					fetch(lo,hi,2070000,"Cards//Rin SSR");
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(Len_SSR_Plus.isSelected()){
				int hi = Integer.parseInt(LenPLusHi.getText());
				int lo = Integer.parseInt(LenPLusLo.getText());

				try {
					fetch(lo,hi,3080000,"Cards//Len SSR+");
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			if(Len_SSR.isSelected()){
				int hi = Integer.parseInt(LenHi.getText());
				int lo = Integer.parseInt(LenLo.getText());

				try {
					fetch(lo,hi,3070000,"Cards//Len SSR");
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(Luka_SSR_Plus.isSelected()){
				int hi = Integer.parseInt(LukaPlusHi.getText());
				int lo = Integer.parseInt(LukaPlusLo.getText());

				try {
					fetch(lo,hi,4080000,"Cards//Luka SSR+");
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(Luka_SSR.isSelected()){
				int hi = Integer.parseInt(LukaHi.getText());
				int lo = Integer.parseInt(LukaLo.getText());

				try {
					fetch(lo,hi,4070000,"Cards//Luka SSR");
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(Meiko_SSR_Plus.isSelected()){
				int hi = Integer.parseInt(MeikoPLusHi.getText());
				int lo = Integer.parseInt(MeikoPLusLo.getText());

				try {
					fetch(lo,hi,6080000,"Cards//Meiko SSR+");
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(Meiko_SSR.isSelected()){
				int hi = Integer.parseInt(MeikoPLusHi.getText());
				int lo = Integer.parseInt(MeikoPLusLo.getText());

				try {
					fetch(lo,hi,6070000,"Cards//Meiko SSR");
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			if(Kaito_SSR_Plus.isSelected()){
				int hi = Integer.parseInt(KaitoPlusHi.getText());
				int lo = Integer.parseInt(KaitoPlusLo.getText());

				try {
					fetch(lo,hi,5080000,"Cards//Kaito SSR+");
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(Kaito_SSR.isSelected()){
				int hi = Integer.parseInt(KaitoSSRHi.getText());
				int lo = Integer.parseInt(KaitoSSRLo.getText());

				try {
					fetch(lo,hi,5070000,"Cards//Kaito SSR");
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(announce_check.isSelected()){
				int day = Integer.parseInt(announce.getText());
				for(int i = 0 ; i <day ;i++){
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyMMdd");  
					LocalDateTime now = LocalDateTime.now();  
					
						  now = now.plusDays(i);
				for(int j =0 ; j < 10 ; j++){
					try{
				URL website = new URL("https://web.gn.xb.org/img/index/"+dtf.format(now)+ "_0"+j+".png");
				System.out.println("https://web.gn.xb.org/img/index/"+dtf.format(now)+ "_0"+j+".png");
				ReadableByteChannel rbc = Channels.newChannel(website.openStream());
				FileOutputStream fos = new FileOutputStream("Cards//Announcement//"+dtf.format(now)+ "_0"+j+".png");
				fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);				
				}
					catch(Exception e2){				
					}
				}
				}
				
			}
			status_label.setText("done");
		}		
		
		
		
	}

	private static void fetch(int start, int end,int val,String path) throws MalformedURLException, IOException{
		
		for(int i = start ; i <end;i++){
			try{
			//	System.out.println(i);
				//"https://web.gn.xb.org/img/cut/card/20800"+i+".png"
			//	System.out.println("https://web.gn.xb.org/img/cut/card/"+(i+val)+".png");
	URL website = new URL("https://web.gn.xb.org/img/cut/card/"+(i+val)+".png");
	ReadableByteChannel rbc = Channels.newChannel(website.openStream());
	//"Cards//Rin SSR+//"+i+".png"
	FileOutputStream fos = new FileOutputStream(path+"//"+(i+val)+".png");
	fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		}
			catch(IOException e){
				
			}
	}
	
}
	
	private static void setUp(){
		File dir = new File("Cards");
		if(!dir.exists())
		dir.mkdir();
		dir = new File("Cards//Rin SSR+");
		if(!dir.exists())
		dir.mkdir();
		dir = new File("Cards//Rin SSR");
		if(!dir.exists())
		dir.mkdir();
		dir = new File("Cards//Miku SSR+");
		if(!dir.exists())
		dir.mkdir();
		dir = new File("Cards//Miku SSR");
		if(!dir.exists())
		dir.mkdir();
		dir = new File("Cards//Len SSR+");
		if(!dir.exists())
		dir.mkdir();
		dir = new File("Cards//Len SSR");
		if(!dir.exists())
		dir.mkdir();
		dir = new File("Cards//Meiko SSR+");
		if(!dir.exists())
		dir.mkdir();
		dir = new File("Cards//Meiko SSR");
		if(!dir.exists())
		dir.mkdir();
		dir = new File("Cards//Kaito SSR+");
		if(!dir.exists())
		dir.mkdir();
		dir = new File("Cards//Kaito SSR");
		if(!dir.exists())
		dir.mkdir();
		dir = new File("Cards//Luka SSR");
		if(!dir.exists())
		dir.mkdir();
		dir = new File("Cards//Luka SSR+");
		if(!dir.exists())
		dir.mkdir();		
		dir = new File("Cards//Announcement");
		if(!dir.exists())
		dir.mkdir();
	}
}
