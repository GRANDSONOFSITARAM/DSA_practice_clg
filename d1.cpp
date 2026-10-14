#include<iostream>
using namespace std;

int main()
{
    int units;
    int rate;
    int bill;
    cout << "Enter the number of units consumed: ";
    cin >> units;

    if (units <= 100) {
        rate = 5;
    }
    else if (units <= 200) {
        rate = 7;
    }
    else if (units <= 300) {
        rate = 10;
    }
    else {
        rate = 12;
    }
    bill = units * rate;

        cout << "Electricity Bill: Rs." << bill << endl;

    return 0;


}