#include <iostream>
using namespace std;

int main() {
    int a = 10;
    int b = a;
    int c = ++a;
    int d = a++;
    d++;
    cout << "d = " << d << endl;
    ++c;
    cout << "c =" << c << endl;
    d--;
    cout << "d = " << d << endl;
    d--;
    cout << "d = " << d << endl;
    return 0;
}