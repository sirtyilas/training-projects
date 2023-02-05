const {readFile,writeFile} = require('fs').promises;
const util = require('util')


const start = async()=>{
	try{
		
		
const first = await readFile('./content/first.txt','utf8')
const second = await readFile('./content/second.txt','utf8')
await writeFile('./content/result-promise.txt',`Hi here are the results:  ${first} ${second}`,{flag:'a'})


	}catch(err){
		console.log(err);
	}
	
}
start();