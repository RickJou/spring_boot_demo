package com.spring.boot.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.demo.mapper.UserBasicInfoMapper;

@Service
@SuppressWarnings("rawtypes")
public class ExampleService {
	@Autowired
	private UserBasicInfoMapper userBasicInfoMapper;
	
	public void addUser(Map user) {
		userBasicInfoMapper.addUser(user);
	}

	public void delUser(Map user) {
		userBasicInfoMapper.delUser(user);
	}

	public Map findUser(Map user) {
		return userBasicInfoMapper.findUser(user);
	}
	
	public Map findUserForMastre(Map user) {
		return userBasicInfoMapper.findUserForMastre(user);
	}

	public Map findUserForSlave(Map user) {
		return userBasicInfoMapper.findUserForSlave(user);
	}

	public Map findUserForPartition1(Map user) {
		return userBasicInfoMapper.findUserForPartition1(user);
	}

	public Map findUserForPartition2(Map user) {
		return userBasicInfoMapper.findUserForPartition2(user);
	}

	public Map findUserForPartition3(Map user) {
		return userBasicInfoMapper.findUserForPartition3(user);
	}
	
}
