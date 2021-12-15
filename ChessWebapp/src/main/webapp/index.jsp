<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/chessboard-1.0.0.min.css">
        <title>Home</title>
    </head>
    <body>
       <!--<div class="rectangle"></div>-->
        <div id="CG"><h1>Chess Game</h1></div>
        <h4>By Brian, Nolan, and Ryan</h4>
        <!--<a href="http://localhost:8080/ChessWebapp/game.html" id="StartBtn">
            <button>Start Game</button>    
        </a>-->
        <div><button id="StartBtn" onclick="document.location='http://localhost:8080/ChessWebapp/game.html'" style="width:300px">Start Game</button></div>
    </body>
</html>
