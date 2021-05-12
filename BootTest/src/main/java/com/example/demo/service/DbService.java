package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DbMapper;
import com.example.demo.dto.TestDTO;

@Service
public class DbService {
	  
	
	@Autowired
	DbMapper dbmapper;
	    
	    public List<TestDTO> getList() throws Exception{
	        
	        return dbmapper.getList();
	        
	    }
}
