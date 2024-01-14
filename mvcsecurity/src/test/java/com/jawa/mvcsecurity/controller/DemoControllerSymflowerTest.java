package com.jawa.mvcsecurity.controller;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DemoControllerSymflowerTest {
	@Test
	public void showLeaders1() {
		DemoController d = new DemoController();
		String expected = "leaders";
		String actual = d.showLeaders();

		assertEquals(expected, actual);
	}
}
