package core;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class NewGenerationTest {
	  @Test
	  public void f1() {
		  String s=Dmitry.alex("dima");
		  assertEquals("TestNG",s);}
	  
	  @Test
	  public void f2() {
		  String s="TestNG";
		  assertEquals("TestNG",s);}
		  
	  @Test
	  public void f3() {
		  String s="TestNG";
		  assertEquals("TestNG",s);}
	  @Test
	  public void f4() {
		  String s="TestNG";
		  assertEquals("TestNG",s);}
  
}
