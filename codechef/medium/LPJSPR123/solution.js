  let N = parseInt(inputChar);
  
  // Write your code here
  let ans=1;
  let i=1;
  while(i<=N){
      ans*=i;
      i++;
  }
  console.log(ans);