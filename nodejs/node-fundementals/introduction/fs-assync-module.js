const {readFile,writeFile} = require('fs')


console.log('start');

readFile('./content/first.txt','utf8',(err,result)=>{

	if(err){
		console.log(err);
		return;
	}
	const firstTxt = result;
	readFile('./content/second.txt','utf8',(err,result)=>{
		if(err){
			console.log(err);
			return;
		}
		const secndTxt = result;
		writeFile('./content/result-assync.txt',`Here is the result : ${firstTxt}, ${secndTxt}`,(err,result)=>{
			if(err){
				console.log(err);
				return;
			}
				console.log("done with this task");
			
		})

	})


})
console.log("starting at the next");

