<!--
Chess Game - game.jsp
Authors: Brian, Nolan, and Ryan
Game page for Chess Game
-->

<!DOCTYPE html>
<html>
  <head>
    <title>Game</title>
    <link rel="stylesheet" href="css/chessboard-1.0.0.min.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <script src="js/chessboard-1.0.0.min.js"></script>
    <script defer src="./index.js"></script>
  </head>
  <body>
      
    <!--<div><a class="BackBtn" href="http://localhost:8080/ChessWebapp/"><button>Back to Home</button></a></div>-->
    
    <div><button id="BackBtn" onclick="document.location='http://localhost:8080/ChessWebapp/'">Back to Home</button></div>
      
    <div id="LP">
        <h2>Let's Play!</h2>
    </div>
    
    <div id="board" style="width:750px"></div>
 
    <div><h3><button id="ResetBtn" style="width:300px">Reset Pieces</button></h3></div>
  </body>
</html>