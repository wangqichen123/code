package com.itstar.demo03;
/**
 * ����һ��final ��
 * @author WQC
 *final ���εķ���Ҳ���ܱ���д
 *final ���α�����������ֵһ����ָ�� ���޷��ı�
 *final class ���Ա�ʹ�õ����ܱ��̳�
 */

public  class Computer {
	//��Ա����
	private String cpu;
	private String memory;
	private String sorage;
	
	//����
	public Computer(){
		
	}
	//��ͨ����
	public void open(){
		System.out.println("��ӭ���ʹ��TZ�Ƽ����");
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getSorage() {
		return sorage;
	}
	public void setSorage(String sorage) {
		this.sorage = sorage;
	}
	
}
