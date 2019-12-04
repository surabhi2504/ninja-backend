package com.example.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.LocationDao;
import com.example.dao.UserDao;
import com.example.model.FileUpload;
import com.example.model.Location;
import com.example.model.Users;
@Service
public class UserServiceImp implements UserService{
@Autowired
private UserDao dao;

@Autowired
private LocationDao ldao;
	@Override
	public Users getRoleByLogin(String username, String password) {
		// TODO Auto-generated method stub
		Users u =dao.findByUsernameAndPassword(username,password);
		return u;
	}
	@Override
	public Location saveLocation(FileUpload fileName) {
		System.out.print(fileName);
	
		FileUpload fU = new FileUpload();
		fU.setFileName(fileName.toString());
		System.out.print(fU.getFileName().toString());
		Location l1=null;
		String filePath = fU.getFileName().toString();
		String row="";
		// reading csv file into stream, try-with-resources
		/*
		 * try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
		 * 
		 * stream.forEach(System.out::println); List<String> loc =
		 * stream.collect(Collectors.toList()); System.out.println(loc);
		 * 
		 * for(int i=0;i<loc.size();i++) { Location l =new Location(); String location=
		 * loc.get(i); l.setLocation_name (location); l1 = dao.save(l);
		 * 
		 * } }
		 * 
		 * catch (IOException ioe) { ioe.printStackTrace(); } if(l1 != null) { return
		 * l1; } else { return null; }
		 * 
		 */
		try{
			
		
		
		BufferedReader csvReader = new BufferedReader(new FileReader(filePath));
		while ((row = csvReader.readLine()) != null) {
		    String[] data = row.split(",");
		    for(int i=0;i<data.length;i++) { 
		    	Location l =new Location();
		    	String location = data[i]; 
		    	l.setLocation_name (location);
		    	l1 = ldao.save(l);
		   		  
		   		  } 
		}
		csvReader.close();
		
		
		}catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
}
		 if(l1 != null) { 
			 return l1;
			 }
		 else { 
			 return null;
		 }
	}
}
