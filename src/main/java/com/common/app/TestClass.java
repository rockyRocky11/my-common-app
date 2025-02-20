package com.common.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestClass {
	public static void main(String[] args) {
		List<String> a = Arrays.asList("3","2","1","0");
		
		System.out.println(a.stream().filter(s -> !s.equalsIgnoreCase("0")).sorted().collect(Collectors.toList()));
	}

}
