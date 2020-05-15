package com.di.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.di.demo.beans.FakeDataSource;
import com.di.demo.beans.FakeJmsBroker;
import com.di.demo.configure.PropertyConfig;

@SpringBootApplication
public class ExternalPropertyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ExternalPropertyApplication.class, args);
		
		FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);
		
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());
		
		
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker)ctx.getBean(FakeJmsBroker.class);
		
		System.out.println(fakeJmsBroker.getUsername());
		System.out.println(fakeJmsBroker.getPassword());
		System.out.println(fakeJmsBroker.getUrl());
		
		
		
		
	}

}
