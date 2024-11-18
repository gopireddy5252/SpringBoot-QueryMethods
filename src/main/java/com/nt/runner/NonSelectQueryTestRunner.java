package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IEmployeeQureyMethods;
@Component
public class NonSelectQueryTestRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeQureyMethods emprepo;
	@Override
	public void run(String... args) throws Exception {
		/*int count=emprepo.hikeSalaryByDesg("hr", 10);
		System.out.println("no of records are effeted:"+count);*/
		
		int count=emprepo.deleteEmpsBydeptno(1, 10);
		System.out.println("no of records are effeted:"+count);
		

	}
	

}
