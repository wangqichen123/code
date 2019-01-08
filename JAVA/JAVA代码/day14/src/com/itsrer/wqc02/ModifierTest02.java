package com.itsrer.wqc02;

import com.itstr.wqc01.Person;

/**
 * 普通类 与 Person 分属于不同的包
 * @author WQC
 *
 */
public class ModifierTest02 {
public static void main(String[] args) {
	Person p=new Person();
	System.out.println(p.name/*+p.sex  +p.adress*/);//只能访问name
}
}
