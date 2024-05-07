#include <string>
#include <vector>

using namespace std;

int gcd(int a, int b) {
    while (b != 0) {
        int temp = a % b;
        a = b;
        b = temp;
    }
    return a;
}


int lcm(int a, int b) {
    return (a * b) / gcd(a, b);
}

vector<int> solution(int n, int m) {
    vector<int> answer;

    int greatest_common_divisor = gcd(n, m); 
    int least_common_multiple = lcm(n, m);   

    answer.push_back(greatest_common_divisor);
    answer.push_back(least_common_multiple);

    return answer;
}
