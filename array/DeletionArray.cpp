#include <iostream>
using namespace std;

int main() {
    int mer[] = {6, 6, 3, 2, 1, 1, 5, 6, 1};//deletion in array 
    int k = 9;

    for (int i = 0; i < k; i++) {
        for (int j = i + 1; j < k; j++) {
            if (mer[i] == mer[j]) {
                for (int shift = j; shift < k - 1; shift++) {
                    mer[shift] = mer[shift + 1];
                }
                k--; 
                j--; //aak element chut raha tha;
            }
        }
    }
    
    for (int i = 0; i < k; i++) {
        cout << mer[i] << " ";
    }
    return 0;
}
