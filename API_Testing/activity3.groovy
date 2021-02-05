package GroovyPrograms;

public class activity3 {
		static void main(def args) {
			def a = 0, b= 1, n = 10;
			print a
			n.times {
				(a,b) = [b,a+b]
				print "," + a
			}
		}
}