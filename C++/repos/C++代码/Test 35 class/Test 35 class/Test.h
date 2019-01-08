#pragma once
#include<iostream>
using namespace std;
class Test
{
public:
	Test();
	Test(int i);
	~Test();
	Test(const Test &t);
	void print();
	void print(int *a);
private:
	int a;
	static int b;
};

