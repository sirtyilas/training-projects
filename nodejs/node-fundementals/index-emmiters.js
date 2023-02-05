const EventEmitter = require('events')
const customEmmoter = new EventEmitter();

customEmmoter.on('response',()=>{
	console.log('data recieved');
})

customEmmoter.emit('response')