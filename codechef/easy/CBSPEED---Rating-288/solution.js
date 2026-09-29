// Complete the code

function isErrorProne(x, y){
    if(x<y) console.log("Yes");
    else console.log("No");
    
}

// Input related code. Please do not change. 
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
  const nums = input.trim().split(' ');
  const x = parseInt(nums[0]); 
  const y = parseInt(nums[1]); 
  isErrorProne(x, y);
});

