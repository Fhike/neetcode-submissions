#include <bits/stdc++.h>
using namespace std;

class Solution{
public:
	bool isAnagram(string s, string t){
		if(s.length() != t.length()){
			return false;
		}

		std::map<char, int> anag;

		for(char c: s){
			anag[c]++;
		}

		for(char c: t){
			anag[c]--;
		}

		for(auto &p : anag){
			if(p.second != 0){
				return false;
			}
		}

		return true;
	}
};