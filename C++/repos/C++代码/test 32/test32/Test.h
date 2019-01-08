#pragma once
#include<iostream>
using namespace std;

class Test
{
public:
	Test();
	Test(int i);
	Test(const Test& t);
	~Test();
	void print() const;

private:
	int a;
	static int b;
};

