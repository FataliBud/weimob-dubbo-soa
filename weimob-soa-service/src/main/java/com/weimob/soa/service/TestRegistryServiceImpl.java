package com.weimob.soa.service;

import org.springframework.stereotype.Service;

import com.weimob.soa.test.TestRegistryService;

@Service("testRegistryService")
public class TestRegistryServiceImpl implements TestRegistryService{

	@Override
	public String hello(String name) {
		// TODO Auto-generated method stub
		return "hello"+name;
	}

}
