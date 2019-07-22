//compile() function is used to make our app functinal
function compile() {
    //link the html, css, and js ids to variables using document.getElementById()
    //using <iframe> to actually show the compiled code and it will allow us to 
    //insert an html document into an existing html page
    
    var html = document.getElementById("html");
    var css = document.getElementById("css");
    var js = document.getElementById("js");
    //using contentWindow which is returning the Window object which is readonly
    var code = document.getElementById("code").contentWindow.document;
  
    //use keyup() inbuilt method whenever user will releases a key from keyboard
    document.body.onkeyup = function() {
      code.open();
      code.writeln(
        html.value +
          "<style>" +
          css.value +
          "</style>" +
          "<script>" +
          js.value +
          "</script>"
      );
      code.close();
    };
  }
  
  compile();

