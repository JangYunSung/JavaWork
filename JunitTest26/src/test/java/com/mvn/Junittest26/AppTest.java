package com.mvn.Junittest26;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	private App app;
	
	public static final String TEST_DIRECTORY = "TEST";
	public static final String TEMP_DIR = "temp";
	public static final String TEST_FILE = "report.txt";
    
	
	
	
	int [] arr = {54,225,631,147,459};
				
	
	/**
     * Rigorous Test :-)
     */
    //실습 1
	@Test
    public void test1()
    {
		app = new App();
		app.sortArr(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
    }
	
	
	
	
	@BeforeClass
	public static void fm() {
		
		System.out.println("폴더/파일 생성, 이름변경, 삭제");
		System.out.println();
		
		String path = System.getProperty("user.dir")
					+ File.separator
					+ TEST_DIRECTORY;   //TEST
		System.out.println("절대경로:  " + path);
		
		// File 객체 생성. --> 디스크에 물리적인 파일/디렉토리가 만들어진것은 아니다!!!
		File f = new File(path);
		
		System.out.println();
		// 폴더 생성: mkdir()
		if(!f.exists()) {   // 디렉토리가 존재하는지 체크
			// 디렉토리가 존재하지 않는다면 생성!
			if(f.mkdir()) {
				System.out.println("폴더 생성 성공!");
			} else {
				System.out.println("폴더 생성 실패!");
			}
		} else {
			System.out.println("폴더가 이미 존재합니다");
		}
	}
	//실습 2
	@Test
	public void test2()
	{
		app = new App();
		app.sortArr(arr);
		System.out.println(arr[arr.length-1]);
		
		System.out.println(arr[0]);
		
		
	}
	
	
    
    
    
    
    
    
    
    
    
}
