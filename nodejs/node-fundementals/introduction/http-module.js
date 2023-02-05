const http = require('http')

const server = http.createServer((req,res)=>{

	if(req.url === '/'){
		res.write('Welcome to our home page');
		res.end();
	}
	
	if(req.url === '/about'){
		res.write('Welcome to our about page');
		res.end();
	}
	res.end('<h2>Opps Not found</h2>')
	
})
server.listen(5000)