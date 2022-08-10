<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Demo Table</title>
</head>
<body>
   <div id="data" align="center"></div>
</body>
<script>

		var book=[
		{"SerialNo":"Serial No","AuthorName":"Author Name","BookName":"Book Name","image":"Book Image","Reading":"File Location"},
		{"SerialNo":1,"AuthorName":"Danielle Steel","BookName":"Marcel Proust","image":"assets/img/romance.jpg","Reading":"marcel.html"},
		{"SerialNo":2,"AuthorName":"Danielle Steel","BookName":"Don Quikole","image":"assets/img/horror.jpg","Reading":"don.html"},
		{"SerialNo":3,"AuthorName":"Danielle Steel","BookName":"Viyssess","image":"assets/img/comedy.jpg","Reading":"viyssess.html"},
		{"SerialNo":4,"AuthorName":"Nora Roberts","BookName":"Marquez","image":"assets/img/education.jpg","Reading":"marquez.html"},
		{"SerialNo":5,"AuthorName":"Nora Roberts","BookName":"The Great Gatsby","image":"assets/img/financial.jpg","Reading":"great.html"},
		{"SerialNo":6,"AuthorName":"Nora Roberts","BookName":"Moby Dick","image":"assets/img/romance.jpg","Reading":"moby.html"},
		{"SerialNo":7,"AuthorName":"Lisa","BookName":"Vdar and peace","image":"assets/img/horror.jpg","Reading":"vdar.html"},
		{"SerialNo":8,"AuthorName":"Lisa","BookName":"Hamlet","image":"assets/img/comedy.jpg","Reading":"hamlet.html"},
		{"SerialNo":9,"AuthorName":"Lisa","BookName":"Odyssey","image":"assets/img/education.jpg","Reading":"odyssey.html"},
		{"SerialNo":10,"AuthorName":"Cardyn Brown","BookName":"Madame Bovary","image":"assets/img/financial.jpg","Reading":"madame.html"},
		{"SerialNo":11,"AuthorName":"Cardyn Brown","BookName":"Divine Comedy","image":"assets/img/romance.jpg","Reading":"divine.html"},
		{"SerialNo":12,"AuthorName":"Cardyn Brown","BookName":"Lolita","image":"assets/img/horror.jpg","Reading":"lolita.html"},
		{"SerialNo":13,"AuthorName":"Robyn","BookName":"The Brothers","image":"assets/img/comedy.jpg","Reading":"brothers.html"},
		{"SerialNo":14,"AuthorName":"Robyn","BookName":"Crime","image":"assets/img/education.jpg","Reading":"crime.html"},
		{"SerialNo":15,"AuthorName":"Robyn","BookName":"Wuthering","image":"assets/img/financial.jpg","Reading":"wuthering.html"},
		]
		var html="<table border=1>"
			
			for(var i=0;i<book.length;i=book.length)
			{
				html +='<td align="center" style="width:40px;height:20px;">'+book[i].SerialNo +'</td><td align="center">'+ book[i].image+'</td><td align="center" style="width:130px;">'+ book[i].AuthorName+'</td><td align="center" style="width:130px;">'+ book[i].BookName+'</td><td align="center">'+ book[i].Reading+ ' </td></tr>';
			}

			for(var i=1;i<book.length;i++)
			{
				html +='<td align="center" style="width:40px;height:20px;">'+book[i].SerialNo +'</td><td ><img src='+ book[i].image+'  style="width:120px;height:80px;"></td><td align="center" style="width:130px;">'+ book[i].AuthorName+'</td><td align="center" style="width:130px;">'+ book[i].BookName+'</td><td><a class="btn btn-primary float-right" role="button" href='+ book[i].Reading+ ' style="width:20px;" target="iframe">Continue Reading &gt;&gt </a></td></tr>';
			}			
		document.getElementById('data').innerHTML=html;
	</script>
</html>