/*Submissions: 10942   Accuracy: 46.94%   Difficulty: Easy
           
Given an array having both positive an negative integers . Your task is to complete the function maxLen which returns the length of maximum subarray with 0 sum . The function takes two arguments an array A and n where n is the size of the array A . 

Input:
The first line of input contains an element T denoting the No of test cases. Then T test cases follow. Each test case consist of 2 lines. The first line of each test case contains a number denoting the size of the array A. Then in the next line are space separated values of the array A .

Output:
For each test case output will be the length of the largest subarray which has sum 0 .*/






int MaxLengthSumZero(int arr[], int l){
int length=0,sum=0;
Map<integer,integer> h=new HashMap();
for(int i=0;i<arr.length;i++){
sum=sum+arr[i];
if(arr[i]===0 && length==0){
length=1;
}
if(h.containsKey(sum)){
length=Math.max(length,i-map.get(sum));
}
else{
map.put(sum,i);
}
}
return length;
} //function
