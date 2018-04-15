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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
	private JLabel Event ;
	private static int[] array;
	private JTextField EventName;
	private JCheckBox chckbxEvent ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					array = new int[12];
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
	 * @throws FileNotFoundException 
	 */
	public MikuCollectDownloader() throws FileNotFoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws FileNotFoundException 
	 */
	private void initialize() throws FileNotFoundException {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton run = new JButton("run");
		run.setAction(action);
		run.setBounds(10, 465, 434, 23);
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
		
		chckbxEvent = new JCheckBox("EventName");
		chckbxEvent.setBounds(30, 408, 97, 23);
		frame.getContentPane().add(chckbxEvent);
		
		EventName = new JTextField();
		EventName.setBounds(133, 409, 149, 20);
		frame.getContentPane().add(EventName);
		EventName.setColumns(10);
			
		
		Event = new JLabel(" ");
		Event.setBounds(30, 440, 97, 14);
		frame.getContentPane().add(Event);
		
		File record = new File("Cards//data");
		if(!record.exists()) {
			MIkuPlusLo.setText(135+"");
			MIkuPlusHi.setText((135+10)+"");
			MIkuLo.setText(107+"");
			MIkuHi.setText((107+10)+"");
			RinPlusLo.setText(41+"");
			RinPlusHi.setText(41+10+"");
			RinLo.setText(18+"");
			RinHi.setText(18+10+"");
			LenPLusLo.setText(35+"");
			LenPLusHi.setText(35+10+"");
			LenLo.setText(20+"");
			LenHi.setText(20+10+"");
			LukaPlusLo.setText(42+"");
			LukaPlusHi.setText(42+10+"");
			LukaLo.setText(23+"");
			LukaHi.setText(23+10+"");
			KaitoPlusLo.setText(41+"");
			KaitoPlusHi.setText(41+10+"");
			KaitoSSRLo.setText(13+"");
			KaitoSSRHi.setText(13+10+"");
			MeikoPLusLo.setText(35+"");
			MeikoPLusHi.setText(35+10+"");
			MeikoLo.setText(16+"");
			MeikoHi.setText(16+10+"");	
			array[0] = 135;
			array[1] = 107;
			array[2] = 41;
			array[3] = 18;
			array[4] = 35;
			array[5] = 20;
			array[6] = 42;
			array[7] = 23;
			array[8] = 41;
			array[9] = 13;
			array[10] = 35;
			array[11] = 16;
		}
		else
			read();
		announce.setText(5+"");
		
	
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Run");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
			try {
				setUp();
			} catch (IOException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			if(Miku_SSR_PLUS.isSelected()){
				int lo = Integer.parseInt(MIkuPlusLo.getText());
				int hi = Integer.parseInt(MIkuPlusHi.getText());
				try {
					int i =fetch(lo,hi,1080000,"Cards//Miku SSR+");
					//System.out.println(i);
					if(i>array[0]){
						array[0] = i;
					}					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(Miku_SSR.isSelected()){
				int lo = Integer.parseInt(MIkuLo.getText());
				int hi = Integer.parseInt(MIkuHi.getText());
				try {
					int i =fetch(lo,hi,1070000,"Cards//Miku SSR");
					if(i>array[1]){
						array[1] = i;
					}
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			if(Rin_SSR_Plus.isSelected()){
				int hi = Integer.parseInt(RinPlusHi.getText());
				int lo = Integer.parseInt(RinPlusLo.getText());

				try {
					int i =fetch(lo,hi,2080000,"Cards//Rin SSR+");
					if(i>array[2]){
						array[2] = i;
					}
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			if(Rin_SSR.isSelected()){
				int hi = Integer.parseInt(RinHi.getText());
				int lo = Integer.parseInt(RinLo.getText());

				try {
					int i =fetch(lo,hi,2070000,"Cards//Rin SSR");
					if(i>array[3]){
						array[3] = i;
					}
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(Len_SSR_Plus.isSelected()){
				int hi = Integer.parseInt(LenPLusHi.getText());
				int lo = Integer.parseInt(LenPLusLo.getText());

				try {
					int i = fetch(lo,hi,3080000,"Cards//Len SSR+");
					if(i>array[4]){
						array[4] = i;
					}
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			if(Len_SSR.isSelected()){
				int hi = Integer.parseInt(LenHi.getText());
				int lo = Integer.parseInt(LenLo.getText());

				try {
					int i =fetch(lo,hi,3070000,"Cards//Len SSR");
				
					if(i>array[5]){
						array[5] = i;
					}
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(Luka_SSR_Plus.isSelected()){
				int hi = Integer.parseInt(LukaPlusHi.getText());
				int lo = Integer.parseInt(LukaPlusLo.getText());

				try {
					int i = fetch(lo,hi,4080000,"Cards//Luka SSR+");
					if(i>array[6]){
						array[6] = i;
					}
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(Luka_SSR.isSelected()){
				int hi = Integer.parseInt(LukaHi.getText());
				int lo = Integer.parseInt(LukaLo.getText());

				try {
					int i =fetch(lo,hi,4070000,"Cards//Luka SSR");
					if(i>array[7]){
						array[7] = i;
					}
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(Meiko_SSR_Plus.isSelected()){
				int hi = Integer.parseInt(MeikoPLusHi.getText());
				int lo = Integer.parseInt(MeikoPLusLo.getText());

				try {
					int i = fetch(lo,hi,6080000,"Cards//Meiko SSR+");
					if(i>array[10]){
						array[10] = i;
					}
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(Meiko_SSR.isSelected()){
				int hi = Integer.parseInt(MeikoHi.getText());
				int lo = Integer.parseInt(MeikoLo.getText());

				try {
					int i =fetch(lo,hi,6070000,"Cards//Meiko SSR");
					if(i>array[11]){
						array[11] = i;
					}
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			if(Kaito_SSR_Plus.isSelected()){
				int hi = Integer.parseInt(KaitoPlusHi.getText());
				int lo = Integer.parseInt(KaitoPlusLo.getText());

				try {
					int i = fetch(lo,hi,5080000,"Cards//Kaito SSR+");
					if(i>array[8]){
						array[8] = i;
					}
					
				} catch (MalformedURLException e1) {					
				} catch (IOException e1) {				
				}
			}
			
			if(Kaito_SSR.isSelected()){
				int hi = Integer.parseInt(KaitoSSRHi.getText());
				int lo = Integer.parseInt(KaitoSSRLo.getText());

				try {
					int i =fetch(lo,hi,5070000,"Cards//Kaito SSR");
					if(i>array[9]){
						array[9] = i;
					}
					
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
			if(chckbxEvent.isSelected()){
				File file = new File("Cards//"+EventName.getText());
				if(!file.exists()){
					file.mkdir();		
				}
				String name =EventName.getText();
				try {
					fetchEvent(name + "/teki_1.png");
					fetchEvent(name + "/teki_2.png");
					fetchEvent(name + "/teki_3.png");
					fetchEvent(name + "/teki_4.png");
					fetchEvent(name + "/teki_5.png");
					fetchEvent(name + "/icon_miku.png");
					fetchEvent(name + "/icon_rin.png");
					fetchEvent(name + "/icon_len.png");
					fetchEvent(name + "/icon_meiko.png");
					fetchEvent(name + "/icon_luka.png");
					fetchEvent(name + "/icon_kaito.png");
					fetchEvent(name + "/title_highscore.png");
					fetchEvent(name + "/help_item.png");
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			Event.setText("done");
			try {
				write();
			} catch (IOException e1) {
	
				e1.printStackTrace();
			} 
		}		
	}
private static void fetchEvent(String name) throws MalformedURLException, IOException{
		
	
		
			try{
	URL website = new URL("https://web.gn.xb.org/img/event/"+name);
	//System.out.println("https://web.gn.xb.org/img/event/"+name);
	ReadableByteChannel rbc = Channels.newChannel(website.openStream());
	FileOutputStream fos = new FileOutputStream("Cards//"+name);
	fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		}
			catch(IOException e){
				
			}
	}
	
	

	private void write() throws IOException{
		File record = new File("Cards//data");
		
		
		String str = "";
		for(int i = 0 ; i < array.length;i++){
			str = str +array[i]+" ";
		}
		//System.out.println(str);
	    BufferedWriter writer = new BufferedWriter(new FileWriter(record));
	    writer.write(str);
	    writer.close();
		
	}
	private static int fetch(int start, int end,int val,String path) throws MalformedURLException, IOException{
		
		int latest = 0;
		for(int i = start ; i <end;i++){
			try{
	URL website = new URL("https://web.gn.xb.org/img/cut/card/"+(i+val)+".png");
	//System.out.println("https://web.gn.xb.org/img/cut/card/"+(i+val)+".png");
	ReadableByteChannel rbc = Channels.newChannel(website.openStream());
	FileOutputStream fos = new FileOutputStream(path+"//"+(i+val)+".png");
	fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
	latest = i;
		}
			catch(IOException e){
				
			}
	}
		return latest;
	
}
	
	private void setUp() throws IOException{
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
		File record = new File("Cards//data");
		if(!record.exists()) {
		record.createNewFile();		
		String str = "135 107"
				+ " 41 18"
				+ " 35 20"
				+ " 42 23"
				+ " 41 13"
				+ " 35 16";
	    BufferedWriter writer = new BufferedWriter(new FileWriter(record));
	    writer.write(str);
	    writer.close();
		}	
	}
	private void read() throws FileNotFoundException{
		
		Scanner s = new Scanner(new File("Cards//data"));
		int i = s.nextInt();
		array[0] = i;
		MIkuPlusLo.setText(i+"");
		MIkuPlusHi.setText((i+10)+"");
		i = s.nextInt();
		array[1] = i;
		MIkuLo.setText(i+"");
		MIkuHi.setText((i+10)+"");
		i = s.nextInt();
		array[2] = i;
		RinPlusLo.setText(i+"");
		RinPlusHi.setText(i+10+"");
		i = s.nextInt();
		array[3] = i;
		RinLo.setText(i+"");
		RinHi.setText(i+10+"");
		i = s.nextInt();
		array[4] = i;
		LenPLusLo.setText(i+"");
		LenPLusHi.setText(i+10+"");
		i = s.nextInt();
		array[5] = i;
		LenLo.setText(i+"");
		LenHi.setText(i+10+"");
		i = s.nextInt();
		array[6] = i;
		LukaPlusLo.setText(i+"");
		LukaPlusHi.setText(i+10+"");
		i = s.nextInt();
		array[7] = i;
		LukaLo.setText(i+"");
		LukaHi.setText(i+10+"");
		i = s.nextInt();
		array[8] = i;
		KaitoPlusLo.setText(i+"");
		KaitoPlusHi.setText(i+10+"");
		i = s.nextInt();
		array[9] = i;
		KaitoSSRLo.setText(i+"");
		KaitoSSRHi.setText(i+10+"");
		i = s.nextInt();
		array[10] = i;
		MeikoPLusLo.setText(i+"");
		MeikoPLusHi.setText(i+10+"");
		i = s.nextInt();
		array[11] = i;
		MeikoLo.setText(i+"");
		MeikoHi.setText(i+10+"");
	}
}
