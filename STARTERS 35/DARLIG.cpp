#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n, k;
	    cin>>n>>k;
	    if(k){
	        if(n % 4 == 0) cout<<"ON";
	        else cout<<"AMBIGUOUS";
	    }
	    else{
	        if(n % 4 == 0) cout<<"OFF";
	        else cout<<"ON";
	    }
	    cout<<endl;
	}
	return 0;
}
