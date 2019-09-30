package com.example.classloader;

import org.junit.Test;

import java.net.URISyntaxException;
import java.util.Optional;

import static org.junit.Assert.assertTrue;

public class ResourceTest {

	@Test
	public void testResources() throws URISyntaxException {
		final Optional<Module> moduleOpt = ModuleTestSupport.getModule();
		assertTrue(moduleOpt.isPresent());
		final Module module = moduleOpt.get();
		assertTrue(module.isOpen("config"));
		assertTrue(module
				.getClassLoader()
				.resources("config/application.properties")
				.count() > 0
		);
	}
}
