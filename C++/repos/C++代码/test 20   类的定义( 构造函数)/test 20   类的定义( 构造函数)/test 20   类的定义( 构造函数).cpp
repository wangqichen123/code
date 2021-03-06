// test 20   类的定义( 构造函数).cpp : 此文件包含 "main" 函数。程序执行将在此处开始并结束。
//

#include "pch.h"
#include <iostream>
using namespace std;
class Clock {  //时钟类的定义
public:         //外部接口，公有成员函数
	Clock(int newH, int newM, int newS);//这是构造函数;
	Clock();                            //这是默认构造函数，一般情况下都需要两种构造函数
	void setTime(int newH, int newM, int newS);
	void showTime();
private:                       //私有类成员
	int hour, minute, second;
};

//构造函数的实现
//时钟类成员函数的具体体现
Clock::Clock():hour(0),minute(0),second(0){}//默认构造函数
Clock::Clock(int newH, int newM, int newS) :
	hour(newH), minute(newM), second(newS) {
}
void Clock::setTime(int newH, int newM, int newS)
{
}
inline void Clock::showTime() {
	cout << hour << ":" << minute << ":" << second << endl;
}
int main()
{
	Clock c(18, 5, 7);//自动调用构造函数
	Clock c2;
	c.showTime();
	c2.showTime();
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
