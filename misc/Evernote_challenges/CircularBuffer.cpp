#include <vector>
#include <string>
#include <iostream>
using namespace std;

vector<string> buffer;
int N, first = 0, last = -1;

int index(int pos) {
    return pos % N;
}

void list() {
    for(int i = 0; i < buffer.size(); ++i) {
        if(buffer[i] != "") cout << buffer[i] << "\n";
    }
    cout << "first: " << first << " " << index(first) << "\n";
    cout << "last: " << last << " " << index(last) << "\n";
}

void append(int n) {
    for(int i = last+1; i < last+n; ++i) {
        string s; cin >> s;
        if(N > 0) {
            buffer[index(i)] = s;
            if(first != -1 && (index(first) == index(i))) ++first;
        }
    }
    last = last+n;
}

void remove(int n) {
    for(int i = 0; i < n; ++i) {
        if(N > 0) buffer[index(first+i)] = "";
    }
    first = first + n;
}

int main() {
    cin >> N;
    buffer.assign(N, "");

    while(true) {
        int num = 0; 
        char command; cin >> command;
        if(command == 'L') list();
        if(command == 'A') {
            cin >> num;
            append(num);
        }
        if(command == 'R') {
            cin >> num;
            remove(num);
        }
        if(command == 'Q') return 0;
    }
}
