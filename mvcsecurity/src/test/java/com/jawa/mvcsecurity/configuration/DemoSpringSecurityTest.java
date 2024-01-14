package com.jawa.mvcsecurity.configuration;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class DemoSpringSecurityTest {
	@Test
	public void filterChain() throws Exception {
		DemoSpringSecurity d = new DemoSpringSecurity();
		HttpSecurity http = null;
		SecurityFilterChain expected = null;
		SecurityFilterChain actual = d.filterChain(http);

		assertEquals(expected, actual);
	}
}
