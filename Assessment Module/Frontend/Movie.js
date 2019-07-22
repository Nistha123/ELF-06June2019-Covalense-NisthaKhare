//movSearch() is returning the json data 
function movSearch() {
    var movieTitle = document.getElementById("title").value;
    console.log(movieTitle);

    //fetch() is a inbuilt method of FETCH API used to send request to a server
    //returning a promise(to fetch data)
    fetch(`http://www.omdbapi.com/?s= ${movieTitle} &apikey=1d629b6a`)
        .then((success) => {
           success.json().then(
                  (data)=>{
                       console.log(data);
                   }
           );

        })
        .catch((error) => {
            console.log(error)
        });
}