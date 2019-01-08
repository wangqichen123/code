package com.itstr.wqc01;
/**
 * 普通的类与Person 没有任何关系，在同一个包下
 * @author WQC
 *
 */
public class ModifierTest01 {
	public static void main(String[] args) {
		
		Person p=new Person();
		System.out.println(p.name+".."+p.address+".."+p.sex);
	}
}
