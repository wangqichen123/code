#pragma once
#include<iostream>
#include<string>
using namespace std;

enum class e_sex{man=1,female};

//∏∏¿‡,ª˘¿‡ 
class people
{
public:
     people();
	 people(string n, int a,e_sex e);
	~people();
	void print() const;
	void run() const;
private:
	string name;
	int age;
	e_sex sex;
};  

class Warrior : public  people
{
public:
	void attack();
	Warrior();
	Warrior(people p, double l, double a);
	void print() const;
    ~Warrior();
private:
	double life;
	double attack_value;
	people *people;
};
