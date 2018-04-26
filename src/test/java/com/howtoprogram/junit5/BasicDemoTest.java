package com.howtoprogram.junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicDemoTest {
  private BasicDemo basicDemo;

  @BeforeAll
  static void setUpAll(){
    System.out.println("BeforeAll");
  }

  @BeforeEach
  void setUp(){
    System.out.println("BeforeEach");
  }

  @AfterAll
  static void tearDownAll(){
    System.out.println("AfterAll");
  }

  @AfterEach
  void tearDown(){
    System.out.println("AfterEach");
  }

  @Test
  void testBasicSalaryWithValidSalary() {
    basicDemo = new BasicDemo();
    String expectedDemo = "Prueba";
    basicDemo.setDemoString(expectedDemo);
    assertEquals(expectedDemo, basicDemo.getDemoString());

  }

}
