#include "Test.h"

int Test::b = 0;

Test::Test()
{
	cout << "这是一个构造函数" << endl;
	b++;
}

Test::Test(int i)
{
	a = i;
	cout << "这是一个带参数的构造函数" << endl;
	b++;
}

Test::Test(const Test & t)
{
	a = t.a;
	cout << "这是一个复制构造函数" << endl;
	b++;
}


Test::~Test()
{
	cout << "这是一个析构函数" << endl;
	b--;
}

void Test::print() const
{
	cout << "对象的值为" << a << endl;
	cout << "静态变量B的值为" << b << endl;
}

int main()
{
	Test c;
	c.print();
	Test w(6);
	w.print();
	Test q(w);
	q.print();
	return 0;
}
