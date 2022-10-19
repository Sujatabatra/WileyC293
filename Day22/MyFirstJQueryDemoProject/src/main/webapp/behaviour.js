$(document).ready(function(){
	  $("#sum").click(function(){
		  var no1=$("#num1").val();
		  var no2=$("#num2").val();
		  var add=parseInt(no1)+parseInt(no2);
		  $("#result").val(add);
	  })
  })