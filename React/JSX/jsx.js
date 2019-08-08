// const name = 'Nistha';
// const element = <h1>Name is {name}</h1>

// function Welcome(props) {
//     return(
//         <div>
//         <h1 style={{color:'blue'}}>{props.name}</h1>
//         {/* <button onClick={() => alert('Button')}>Click</button> */}

//         <button onClick={alert.bind(this,'Button')}>Click</button>
//         </div>
//     )
// }

class Message extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            name : 'Akshay',
            id : 1
        }
     //   this.changeMessage = this.changeMessage.bind(this);
        this.clickLink = this.clickLink.bind(this);
    }
    render(){
        console.log("rendering")
        return(
            <div>
                <h1>{this.state.name}</h1>
                <h1>{this.state.id}</h1>
                <button onClick={this.changeMessage}>Change Message</button>
                <a href="https://www.google.com" onClick={this.clickLink}>Link</a>
            </div>
        )
    }

    clickLink(){
       
    }

    // changeMessage(){
    //     console.log("Change Message")
    //     this.setState({
    //         name : 'alia',
    //         id : 2
    //     })
    // }

    changeMessage = () => {
        console.log("Change Message")
        this.setState({
            name : 'alia',
            id : 2
        })
    }
}

ReactDOM.render(<Message />,
                document.getElementById('app')) 