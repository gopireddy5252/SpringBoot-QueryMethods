package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Employee;


public interface IEmployeeQureyMethods extends JpaRepository<Employee, Integer> {
	
	@Transactional
	@Modifying
	@Query("update Employee set sal=sal+(sal*:percentage/100) where desg=:desg")
	public int hikeSalaryByDesg(String desg,int percentage);
	
	@Transactional
	@Modifying
	@Query("delete from Employee where deptno>=:start and deptno<=:end")
	public int deleteEmpsBydeptno(int start,int end);

}
