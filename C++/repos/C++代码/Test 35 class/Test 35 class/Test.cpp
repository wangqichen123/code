#include "Test.h"

int Test::b = 0;

Test::Test()
{
}

Test::Test(int i)
{
	a = i;
}


Test::~Test()
{
}

Test::Test(const Test & t)
{
	a = t.a;
}

void Test::print()
{
	cout << "对象的值为" << a<<endl;
}

void Test::print(int * o)
{
	a = *o;
	cout << "a的值" << *o<< endl;
}


int main()
{
	int p;
	p = 5;
	int *str;
	str = &p;
	cout << "指针P" << str <<*str<< endl;
	p = 10;
	cout << "指针P" << *str << endl;

	Test w;
	
	Test q(5);
	
	Test c(q);
	

	Test *ptr;
	ptr = &q;
	//q.print();
	//(*ptr).print(); 一般用下面这种指针;
	Test *t = new Test(10);
	 ptr->print();
	 t->print();
	 t->print(str);
	 int chr[5] = { 0,1,2,3,4 };
	 int *z = chr;
	 cout << chr[0] << endl;
	 z = z + 1;
	 cout << *z << endl;

	 //Test *str2 = new Test[];
	 //str2[0].print();
	 //str2[1].print();
	 //delete[] str2;

	 delete t;
	return 0;
}