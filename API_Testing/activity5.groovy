package GroovyPrograms;

public class activity5 {
		static void main(args) {
			def fullList = [11, 2, 19, 5, "Mango", "Apple", "Pineapple"]
			
			def strList = fullList.minus([11, 2, 19, 5])
			
			def intList = fullList.minus(["Mango", "Apple", "Pineapple"])
		
			println "Sorted String list: ${strList.sort()}"
			println "Sorted Integer list: ${intList.sort()}"
		}
	}
