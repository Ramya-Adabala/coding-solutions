  let N = parseInt(inputChar);
  
  // Write your code here
  let digit=0;
  while(N>0){
      digit++;
      N=Math.floor(N/10);
  }
  console.log(digit);