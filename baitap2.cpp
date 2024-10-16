#include <iostream>
using namespace std;
int main(){
	int choice;
	cout<<" 1.Dien tich hinh tron\n";
	cout<<" 2.Dien tich hinh chu nhat\n";
	cout<<" 3.Dien tich hinh vuong\n";
	cout<<" 4.Dien tich hinh tam giac\n";
	cout<<"Nhap so tu [1:4] de chon trong menu: ";
	cin>>choice;
	if (choice = 1 )
		cout<<"Dien tich hinh tron la: pi*(ban kinh binh phuong)"<<endl;
	else if (choice = 2 )
		cout<<"Dien tich hinh chu nhat la: tich hai canh dai va rong"<<endl;
	else if (choice = 3 )
		cout<<"Dien tich hinh vuong la: mot canh binh phuong"<<endl;
	else if (choice = 4 )
		cout<<"Dien tich hinh tam giac la: "<<endl;
	else 
		cout<<"F"<<endl;
	return 0;
	
}
