package GroovyPrograms;

public class activity6 {
		static void main(args) {
			def map = [:]
			
			map.put(1, "Parrots")
			map.put(2, "Dogs")
			map.put(3, "Peacocks")
			
			for(def item : map) {
				println item
			}
			
			def newMap = map.plus([4: "Horses", 5: "Donkeys"])
			println newMap
			
			println newMap.values().sort()
			println newMap.values().sort { it.length() }
		}
	}
