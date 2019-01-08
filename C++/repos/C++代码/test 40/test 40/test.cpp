#include "test.h"




people::people()
{
	name = "无名氏";
	age = 0;

}


	people::people(string n, int a, e_sex e)
{
	name = n;
	age = a;
	sex = e;
}

people::~people()
{
}

void people::print() const
{
	string sexman;
	if (sex == e_sex::man)
		sexman = "man";
	else
		sexman = "female";
	cout << "姓名" << name << "年龄" << age << "性别" << sexman << endl;
}

void people::run() const
{
	cout << "is running" << endl;
}

int main()
{
	people w("wqc", 10, e_sex::man);
	w.print();
	

	return 0;
	
}

void Warrior::attack()
{
	cout << "attack the enemy" << endl;
}

Warrior::Warrior()
{
	people = new people();
	life = 0.00;
	attack_value = 0.00;
	
}

Warrior::Warrior(people p, double l, double a)
{
	people = new people(p);
	life = 1;
	attack_value = a;
}
void  Warrior::print()const
{
	people->print();
	cout << "life is" << life << "and acctok is" << attack_value << endl;
}

Warrior::~Warrior()
{
	delete people;
}
