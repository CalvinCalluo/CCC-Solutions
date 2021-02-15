#include <iostream>
using namespace std;

int main() {
    int P, N, R;
    cin >> P;
    cin >> N;
    cin >> R;

    int infected;
    infected = R * N;

    int ans = 0;

    while(N <= P){
        ++ans;
        N += infected;
        infected *= R;
    }
    cout << ans;
}
