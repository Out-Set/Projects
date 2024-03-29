package com.project.blogappapis;

import com.project.blogappapis.Config.AppConstants;
import com.project.blogappapis.Entity.Role;
import com.project.blogappapis.Repository.RoleRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootApplication
public class BlogAppApisApplication implements CommandLineRunner {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private RoleRepo roleRepo;

	public static void main(String[] args) {
		SpringApplication.run(BlogAppApisApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.passwordEncoder.encode("xyz"));
//
//		// Setting roles
//		try {
//			Role role1 = new Role();
//			role1.setId(AppConstants.ADMIN_USER);
//			role1.setName("ADMIN_USER");
//
//			Role role2 = new Role();
//			role2.setId(AppConstants.NORMAL_USER);
//			role2.setName("NORMAL_USER");
//
//			List<Role> roles = List.of(role1, role2);
//
//			List<Role> result = this.roleRepo.saveAll(roles);
//
//			// to see the created roles
//			result.forEach(r->{
//				System.out.println(r.getName());
//			});
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
