  let N = parseInt(inputChar);
  
  // Write your code here
  let sum=0;
  let product=1;
  while(N>0){
      let digit=N%10;
      sum+=digit;
      product*=digit;
      N=Math.floor(N/10);
  }
  console.log(sum,product);