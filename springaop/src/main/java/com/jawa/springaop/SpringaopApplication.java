package com.jawa.springaop;

import com.jawa.springaop.dao.AccountDAO;
import com.jawa.springaop.dao.ManagementDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sound.midi.Soundbank;

@SpringBootApplication
public class SpringaopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringaopApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, ManagementDAO managementDAO) {
		return runner -> {
			demoAccountDao(accountDAO, managementDAO);
		};
	}

	public void demoAccountDao(AccountDAO accountDAO, ManagementDAO managementDAO) {
		accountDAO.addAccount();
		managementDAO.getCode(9);
	}

}
