#pragma once
#include<iostream>
using namespace std;

class Test
{
public:
	Test(int i);
	Test();
	~Test();
	Test(const int&i);
private:
	int a;
	static int b;
};

