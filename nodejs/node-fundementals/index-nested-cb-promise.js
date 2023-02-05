const {readFile,writeFile} = require('fs');
const util = require('util')
const readFilePromise = util.promisify(readFile);
const writeFilePromise = util.promisify(readFile);


const getText = (path)=>{

	return new Promise((resolve,reject)=>{

		readFile(path,'utf8', (err,data)=>{

			if(err){
				reject(err)				
			}
			resolve(data)
		})
	})
}
getText('./content/first.txt').then((result)=>{console.log(result);}).catch((exc)=>{
	console.log(exc);
})

const start = async()=>{
	try{
		
		
const first = await getText('./content/first.txt')
const second = await getText('./content/second.txt')


	}catch(err){
		console.log(err);
	}
	
}
start();