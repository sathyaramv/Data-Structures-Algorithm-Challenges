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
