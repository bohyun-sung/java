package Study;

import java.util.ArrayList;
import java.util.List;

public class Study_test {
	public static void main(String[] args) {
		List<Study> list = new ArrayList();
		
		Study study = new Study();
		study.setId("bohyun");
		study.setPwd("123");
		list.add(study);
		
		List<Study> list2 = new ArrayList();
		Study study2 = new Study();
		study2.setId("bohyun");
		study2.setPwd("123");
		list2.add(study2);
		
		System.out.println(study.equals(study2));
		System.out.println(list.equals(list2));
//		for (Study study4 : study) {
//			study.equals(study3);
//			
//		}
	}
}
