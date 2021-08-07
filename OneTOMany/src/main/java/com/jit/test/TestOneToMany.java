package com.jit.test;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.jit.Repo.AddrsRepo;
import com.jit.Repo.empRepo;
import com.jit.model.Address;
import com.jit.model.employee;

public class TestOneToMany implements CommandLineRunner {

	@Autowired
	private empRepo empR;

	@Autowired
	private AddrsRepo addrsrepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Address a1 = new Address(10, "bihar", "802123");
		Address a2 = new Address(11, "buxar", "802119");
		Address a3 = new Address(12, "itarhi", "802120");
		addrsrepo.save(a1);
		addrsrepo.save(a2);
		addrsrepo.save(a3);

//employee e1=new employee(101,"ajay",2000.0,Arrays.asList(a1,a2));
		employee e1 = new employee();
		employee e2 = new employee();

		empR.save(e1);
		empR.save(e2);
	}

}
