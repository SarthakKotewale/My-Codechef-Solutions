#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin >> t;
	while(t--){
	    
	    long long int n, x, y, i, co=0;
	    cin >> n;
	    int arr[n];
	    for(int i = 0; i < n; i++){
	        cin >> arr[i];
	        if(arr[i - 1] > arr[i] && i >= 1){
	            swap(arr[i-1], arr[i]);
	            if(arr[i - 2] > arr[i - 1] && i >= 2){
	                co+=2;
	            }
	            else if(arr[i-2] < arr[i-1] && i >= 2){
	                co+=1;
	            }
	            else if(i==1){
	                co+=1;
	            }
	            else{
	                co+=1;
	            }
	        }
	        
	    }
	    if(co < 2){
	        cout<<"YES"<<endl;
	    }else{
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}
