package com.mvn.Junittest26;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class AppTest3 {

	
	private String str;
	private String expected;
	//실습 3
	
	@Parameters
	public static Collection<String[]>getTestParameter(){
		return Arrays.asList(new String [][]{
			{"010-5555-1245", "01055551245"},
			{"010-6621-2124", "01066212124"},
			{"010-2222-6666", "01022226666"}
		});
	}
	
	
	public AppTest3(String expected , String str) {
		super();
		this.expected = expected;
		this.str = str;
	}
		
	@Test
	public void sp(){
	App app = new App();
	expected.replaceAll("[^0-9]","");
	assertEquals(str , app.toNumber(expected));
	}

}
