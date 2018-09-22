package com.ljp.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.Lists;

public class LambdaStream {

	
	public static void main(String[] args) {
		
		
//		List<Integer> nums = Lists.newArrayList(1,1,null,2,3,4,null,5,6,7,8,9,10);
//		List<List<Integer>> partition = Lists.partition(nums, 10);
//		System.out.println(partition.size());
//		
//		
//		System.out.println("---------------------------------------------");
//		
//		System.out.println("sum is:"+nums.stream().filter(num -> num != null).
//				distinct().mapToInt(num -> num * 2).
//				peek(System.out::println).skip(2).limit(4).sum());
//	
//		System.out.println("---------------------------------------------");
//		nums.forEach(item -> System.out.print("  " + item));
//		System.out.println("-------------------------------------------");
		
//		nums.stream().filter(item->item != null).peek(item->{item--;System.out.print("  " + item);}).collect(toList());
		
//		List<Integer> nums = Lists.newArrayList(1,1,null,2,3,4,null,5,6,7,8,9,10);
//		List<Integer> numsWithoutNull = nums.stream().filter(num -> num != null).
//				collect(() -> new ArrayList<Integer>(),
//						(list, item) -> list.add(item),
//						(list1, list2) -> list1.addAll(list2));
//		numsWithoutNull.stream().forEach(item -> System.out.print(" " + item));
//		System.out.println();
//		System.out.println("===============================================");
//		nums.stream().filter((item)->item != null).collect(Collectors.toList()).forEach(item -> System.out.print(" " + item));;
		
		List<Integer> ints = Lists.newArrayList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("ints sum is:" + ints.stream().reduce((sum, item) -> sum + item).get());
	}
}
