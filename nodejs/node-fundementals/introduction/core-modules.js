// const names = require('./names');
// const sayHi = require('./utils')
// require('./mind-grenade')
// console.log(names);
// sayHi(names.john)

const os = require('os')
const path = require('path')
//info about current user
const user = os.userInfo()
console.log(path.sep);//meth returns systems uptime in seconds

console.log(`The system uptime is ${os.uptime() / 60 /60 }`);