package com.example.demo.dao;

import java.util.List;

import com.example.demo.dto.TestDTO;

public interface DbMapper {
	public List<TestDTO> getList() throws Exception;
}
