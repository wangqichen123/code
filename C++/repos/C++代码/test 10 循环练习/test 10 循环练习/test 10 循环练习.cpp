// test 10 循环练习.cpp : 此文件包含 "main" 函数。程序执行将在此处开始并结束。
//

#include "pch.h"
#include <iostream>
using namespace std;

const float pi = 3.1416;
int main()
{
	int iType;
	float radius, a, b,c, area;
	cout << "图形的类型为：1_圆形 2_长方形 3_正方形";
	cin >> iType;
	switch (iType)
	{
	case 1:
		cout << "圆的半径为:";
		cin >> radius;
		area = pi * radius*radius;
		cout << "圆的面积为：" << area << endl;
		break;
	case 2:
		cout << "长方形的长为:";
		cin >> a;
		cout << "长方形的宽为:";
		cin >> b;
		area = a * b;
		cout << "长方形的面积为" << area << endl;
		break;
	case 3:
		cout << "正方形的边长为";
		cin >> c;
		area = c * c;
		cout << "正方形的面积为" << area << endl;
		break;
	default:
		cout << "输入的不是正确的值！！！";
	}

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
