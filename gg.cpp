#include<iostream>

#include<climits>

using namespace std;

int main(){

    ios_base::sync_with_stdio(false);

   cin.tie(NULL);

    string s;

    cin>>s;

    int l = s.length(), res = 0, max_close = INT_MAX, open = 0;

    for(int i=0;i<l;i++){

        if(s[i] == '(')

            open++;

        else

            open--;

        // We are making the count to zero if there is a new closed bracket without an open bracket (Since it violates Bracket sequence)

        if(max_close > open){

            max_close = open;

            res = 0;

        }

        // Incrementing count with a hope that an open bracket comes next and it will be the index for bracket sequence ( When res = 0 )

        // Also if there is a bracket pair in between it will be a new index for a bracket sequence

        if(max_close == open)

            res++;

    }

    // If it's end of string and you have open brackets or closed brackets left then it's not a perfect sequence with any index

    if(open)

        cout<<0<<endl;

    else

        cout<<res<<endl;

}
