// test 16 函数重载.cpp : 此文件包含 "main" 函数。程序执行将在此处开始并结束。
//

#include "pch.h"
#include <iostream>
using namespace std;
int sum(int a, int b) {
	return a * a + b * b;
}

double sum(double a, double b) {
	return a * a + b * b;
}
int main()
{
	int a, b;

	cout << "输入两个整数" << endl;
	cin >> a >> b;
	cout << "用第一个重载函数" << sum(a, b) << endl;
	double x, y;
	cout << "输入两个实数" << endl;
	cin >> x >> y;
	cout << "用第二个重载函数" << sum(x, y) << endl;
	return 0;
    //std::cout << "Hello World!\n"; 
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
