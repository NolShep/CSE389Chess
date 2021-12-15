/*
Chess Game - index.js
Authors: Brian, Nolan, and Ryan
JavaScript backend for Chess Game
*/


var config = {
    position: 'start',
    draggable: true
};

var board = Chessboard("board", config);

$('#ResetBtn').on('click', board.start);











