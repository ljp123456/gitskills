package com.ljp.lambda;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LambdaDemo {

	
	public static void main(String[] args) {
		String[] players = {"Rafael\\D Nadal", "Novak Djokovic",   
			    "Stanislas Wawrinka", "David Ferrer",  
			    "Roger Federer", "Andy Murray",  
			    "Tomas Berdych", "Juan Martin Del Potro",  
			    "Richard Gasquet", "John Isner"};  
			   
			// 1.1 使用匿名内部类根据 name 排序 players  
			Arrays.sort(players, new Comparator<String>() {  
			    @Override  
			    public int compare(String s1, String s2) {  
			        return (s1.compareTo(s2));  
			    }  
			});
			
			List<String> billCodes = Arrays.asList(players);
			Set<String> mergedBills = new HashSet<>(billCodes.size());
			List<String> safeBills = billCodes.stream().map(s -> s.replace("\\D", "----")).filter(s -> s.length() > 20).collect(toList());
			List<String> bagNos = safeBills.stream().filter(bill -> bill.length() <= 10).distinct().collect(toList());
	
			billCodes.forEach(System.out::print);
			System.out.println();
			System.out.println("----------------------------");
			
			mergedBills.forEach(System.out::print);
			
			System.out.println();
			System.out.println("-----------------------------");
			
			safeBills.forEach((safeBill) -> System.out.print(safeBill));
			
			System.out.println();
			System.out.println("-----------------------------");
			
			bagNos.forEach(System.out::print);
			
			System.out.println();
			System.out.println("-----------------------------");
	}
	
	/*public static void main(String[] args) {
		
		
		String[] atp = {"Rafael Nadal", "Novak Djokovic",  
			       "Stanislas Wawrinka",  
			       "David Ferrer","Roger Federer",  
			       "Andy Murray","Tomas Berdych",  
			       "Juan Martin Del Potro"};  
		List<String> players =  Arrays.asList(atp);
		
		System.out.println("----------------------------");
		// 以前的循环方式  
		for (String player : players) {  
		     System.out.print(player + "; ");  
		}
		
		System.out.println("");
		System.out.println("-------------------------------");
		
		// 使用 lambda 表达式以及函数操作(functional operation)  
		players.forEach((player) -> System.out.print(player + "; "));
		
		System.out.println("");
		System.out.println("-------------------------------");
		
		// 在 Java 8 中使用双冒号操作符(double colon operator)  
		players.forEach(System.out::println);  
		
		System.out.println("");
		System.out.println("---------------------");
		System.out.println();
		
		
		new Thread(() -> System.out.println("Hello world !")).start();
		
		Runnable race2 = () -> System.out.println("Hello Runnable");
		race2.run();
		
		System.out.println("----------------------------------------");
		
		Person person = (name) -> System.out.println("hello " + name);
		person.sayName("xiaoming");
	}
	*/
	
	
	
}
