#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    long long n, k;
	    cin>>n>>k;
	    int arr[n];
	    for(int i = 0; i < n; i++){
	        cin>>arr[i];
	    }
	    int m = arr[0];
	    for(int i = 0; i < n; i++){
	        m = min(m, arr[i]);
	    }
	    long long ans = k / m + (k%m!=0);
	    cout<<max(n, ans) <<endl;
	    
	}
	return 0;
}
