/**
  
 
var http = require('http');
var fs = require('fs');
http.createServer(function (req, res) {
  fs.readFile('home.html', function(err, data) {
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write(data);
    return res.end();
  });
}).listen(8080);

*/

var mysql=require('mysql');

var con=mysql.createConnection({
	host:"localhost",
	user:"root",
	password:"root"
});

con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!");
});