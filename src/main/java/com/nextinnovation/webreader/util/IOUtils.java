package com.nextinnovation.webreader.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOUtils {
	public static List<String> ReadChatTxt(String url){
		List<String> list = new ArrayList<String>();
		try {
			BufferedReader fis = 
					new BufferedReader(new InputStreamReader(
							new FileInputStream(url),"utf-8"));
			String str = null;
			while((str = fis.readLine())!= null){
				list.add(str);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public static void WriteChatTxt(String url,List<String> list){
		try {
			BufferedWriter bw = 
					new BufferedWriter(new OutputStreamWriter(
							new FileOutputStream(url),"utf-8"));
			
			for (String string : list) {
				bw.write(string);
				bw.newLine();
			}
			bw.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
