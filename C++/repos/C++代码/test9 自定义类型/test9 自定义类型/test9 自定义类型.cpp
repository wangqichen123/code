// test9 自定义类型.cpp : 此文件包含 "main" 函数。程序执行将在此处开始并结束。
//enum 枚举类型

#include "pch.h"
#include <iostream>
using namespace std;
enum Gameresult { WIN, LOSE, TIE, CANCLE };
int main()
{
	/*enum 枚举类型名{变量值列表}
	enum weekday
	{sun,mon,tue,wed,thu,fri,sat}
	默认情况下 sun=0 ,mon=1.....
	枚举类型不能对他们赋值！！！！！
	*/
	Gameresult result;
	enum Gameresult omit = CANCLE;
	for (int count = WIN; count <= CANCLE; count++)
	{
		result = Gameresult(count);
	if (result == omit)
		cout << "the game was cancelled" << endl;
	else {
		cout << "the game was played" << endl;
		if (result == WIN)
			cout << "and we won" << endl;
		if (result == LOSE)
			cout << "and we lose" << endl;
	}
	}

	return 0;




   // std::cout << "Hello World!\n"; 
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
