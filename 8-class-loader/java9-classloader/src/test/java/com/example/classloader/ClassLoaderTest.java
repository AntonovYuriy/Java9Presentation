package com.example.classloader;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ClassLoaderTest {

  @Test
  public void testClassLoaderName() {
    ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
    final List<String> names = new ArrayList<>();
    while (classLoader != null) {
      names.add(classLoader.getName());
      classLoader = classLoader.getParent();
    }
    assertEquals(2, names.size());
    assertEquals("app", names.get(0));
    assertEquals("platform", names.get(1));
  }

  @Test
  public void testGetDefinedPackages() {
    final ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
    final Package[] packages = classLoader.getDefinedPackages();

    assertTrue(Stream.of(packages).map(Package::getName).noneMatch(Predicate.isEqual("java.lang")));
    assertTrue(Stream.of(packages).map(Package::getName).anyMatch(Predicate.isEqual("com.example.classloader")));
    assertNull(classLoader.getDefinedPackage("java.lang"));
    assertNotNull(classLoader.getDefinedPackage("com.example.classloader"));
  }
}
