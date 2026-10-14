#include <iostream>
#include <string>

using namespace std;

long long rotateDigits(long long n, int k) {
    string s = to_string(n);
    int len = s.length();
    
    k = k % len;
    if (k < 0) {
        k += len; // handles negative k (right rotation)
    }
    
    string rotated = s.substr(k) + s.substr(0, k);
    return stoll(rotated);
}

int main() {
    long long n;
    int k;
    
    cout << "Enter N: ";
    cin >> n;
    cout << "Enter K: ";
    cin >> k;
    
    long long ans = rotateDigits(n, k);
    cout << "Result: " << ans << endl;
    
    return 0;
}