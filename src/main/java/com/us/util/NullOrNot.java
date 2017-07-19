package com.us.util;

public class NullOrNot {
	public boolean isNotAllNull(Object ... objs){
		boolean flag = false;
		if (objs != null) {
			for (Object obj : objs) {
				if (null == obj) {
					flag = flag & false;
				}
			}
		}
		return flag;
	}
}

