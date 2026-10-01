    let N = parseInt(inputChar);
    let y = 1;
    let result = [];

    while (y <= N) {
     
        result.push(y * y);
        y++;
    }
   
    
    console.log(result.join(' '));