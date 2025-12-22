<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter Marks</title>
</head>
<body>

       <h2>Enter Student Marks</h2>
       
       <form action="calculateResult">
       
            Name : <input type = "text" name = "name"> <br><br>
            
            Subject 1 : <input type = "number" name = "m1"> <br><br>
            Subject 2 : <input type = "number" name = "m2"> <br><br>
            Subject 3 : <input type = "number" name = "m3"> <br><br>
            
            <input type = "submit" value = "Calculate Result">
            
       
       </form>

</body>
</html>