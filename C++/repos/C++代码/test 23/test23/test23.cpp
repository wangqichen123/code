// test23.cpp : 此文件包含 "main" 函数。程序执行将在此处开始并结束。
//

#include "pch.h"
#include <iostream>
using namespace std;
class WQC
{
public:
	WQC(int in);
	~WQC();
	void set(int b)
	{
		a = b;
	}
	void print()
	{
		cout << a<<endl;
	}
	int p() {
		return a * a;
	}

private:
	int a;
	

};

WQC::WQC(int in)
{
	a = in;
}

WQC::~WQC()
{
}
void swap(int &a, int &b)
{
	int c;
	c = a;
	a = b;
	b = c;
}
int ping(int a)
{
	int b;
	b = a * a;
	return b;
}
void print(int a, int b)
{
	cout <<"a的值"<<a<<endl;
	cout <<"b的值"<< b<< endl;
}
int main()
{
	int a = 5;
	int b = ping(a);
    //cout << "Hello World!\n"; 
	print(a,b);
	swap(a, b);
	print(a, b);
	WQC w(5);
	//w.set(5);
	w.print();
	cout << w.p() << endl;
	return 0;
}

// 运行程序: Ctrl + F5 或调试 >“开始执行(不调试)”菜单
// 调试程序: F5 或调试 >“开始调试”菜单

// 入门提示: 
//   1. 使用解决方案资源管理器窗口添加/管理文件
//   2. 使用团队资源管理器窗口连接到源代码管理
//   3. 使用输出窗口查看生成输出和其他消息
//   4. 使用错误列表窗口查看错误
//   5. 转到“项目”>“添加新项”以创建新的代码文件，或转到“项目”>“添加现有项”以将现有代码文件添加到项目
//   6. 将来，若要再次打开此项目，请转到“文件”>“打开”>“项目”并选择 .sln 文件
