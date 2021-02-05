package GroovyPrograms

class activity1 {

	static void main(args) {			
					def x //In Groovy
					int y //In Java
					def arr = [1, 2.0, "lakshmi", true, x, y]
					arr.each { println "Value is: " + it +". Data type is: " + it.getClass() }
				}
			}
	
