package com.mn.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainTest {

	
	public static void main(String[] args)throws Exception {
		
		File file=new File("F:\\dir");
		
		
		File[] files=file.listFiles();
		SimpleDateFormat sdf=new SimpleDateFormat("MMM");
		String month="";
		int count=0;
		List<String> dates=new ArrayList<String>();
		for(File f:files){
			month = sdf.format(f.lastModified());
			dates.add(month);
			count++;
		}
		
		Map<String, Long> collect = dates.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
		System.out.println(collect);
		System.out.println("file count  ::"+count);
		
		}
		
	

}
