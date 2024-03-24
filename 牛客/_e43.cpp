//#define _CRT_SECURE_NO_WARNINGS
#include<bits.dc++.h>
using namespace std;
const int N = 100010;
int a[N], b[N];
int main() {
	
	int n, t, i;
	//map<int, int> Map;
	cin >> t;
	while (t--) {
		cin >> n;
		for (int i = 1; i <= n; i++) {
			cin >> a[i];
		}
		for (int i = 1; i <= n; i++) {
			cin >> b[i];
		}
		for (i = 1; i <= n; i++) {
			//Map.insert(a[i], b[i]);
			if (a[i] == a[i - 1] && b[i] != b[i - 1]) {
				break;
			}
		}
		if (i > n) {
			cout << "Yes" << endl;
		}
		else {
			cout << "No" << endl;
		}
	}
	return 0;
}