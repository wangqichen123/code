#include "Test.h"

int Test::b = 0;

Test::Test()
{
	cout << "����һ�����캯��" << endl;
	b++;
}

Test::Test(int i)
{
	a = i;
	cout << "����һ���������Ĺ��캯��" << endl;
	b++;
}

Test::Test(const Test & t)
{
	a = t.a;
	cout << "����һ�����ƹ��캯��" << endl;
	b++;
}


Test::~Test()
{
	cout << "����һ����������" << endl;
	b--;
}

void Test::print() const
{
	cout << "�����ֵΪ" << a << endl;
	cout << "��̬����B��ֵΪ" << b << endl;
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
