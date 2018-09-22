package com.ljp.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<String> jobs = new ArrayList<>(7);
		jobs.add("wonder:waybillTimeRangeAuditJob:2018-09-16 00:00:00");
		jobs.add("wonder:waybillTimeRangeAuditJob:2018-09-21 00:00:00");
		jobs.add("wonder:waybillTimeRangeAuditJob:2018-09-15 00:00:00");
		jobs.add("wonder:waybillTimeRangeAuditJob:2018-09-19 00:00:00");
		jobs.add("wonder:waybillTimeRangeAuditJob:2018-09-18 00:00:00");
		jobs.add("wonder:waybillTimeRangeAuditJob:2018-09-17 00:00:00");
		jobs.add("wonder:waybillTimeRangeAuditJob:2018-09-14 00:00:00");
		jobs.add("wonder:waybillTimeRangeAuditJob:2018-09-20 00:00:00");
		
		
		String pickRecentJob = pickRecentJob(jobs);
		System.out.println(pickRecentJob);
	}
	
	public static String pickRecentJob(Collection<String> jobs) {
        return jobs.stream().max(Comparator.naturalOrder()).orElse(null);
    }
}
