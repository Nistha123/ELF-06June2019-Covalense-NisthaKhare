class Lifecycle extends React.Component{
    constructor(props){
        super(props)
        console.log('constructor Lifecycle')
        this.state = {
            name : 'Nistha',
            checked : true
        }
    }
    static getDerivedStateFromProps(){
        console.log('GetDerivedStateFromProps Lifecycle');
        return null;
    }
    render(){
        console.log('Render Lifecycle')
        if(this.state.checked){
            return(
                // <div>
                //      <h1>{this.state.name}</h1>
                //      <button onClick={this.changeName.bind(this)}>Change Name</button>
                // </div>  
                <Child/>         
            )
        }   
        return <h1>Checked is false</h1>   
    }
        componentDidMount(){
            console.log('Component Did Mount Lifecycle')
        }

        shouldComponentUpdate(){
            console.log('Should Component Update')
            return true;
        }

        getSnapshotBeforeUpdate(){
            console.log('Get Snapshot Before Update Lifecycle') 
            return "SnapshotData";
        }

        componentDidUpdate(props,state,Snapshot){
            console.log('Component Updated Lifecycle') 
            console.log('Snapshot data is : '+Snapshot)
        }

        changeName(){
            this.setState({
                name : 'Nishu'
            })
        }
    }

    class Child extends React.Component{
        constructor(props){
            super(props)
            console.log('constructor Child')
            this.state = {
                name : 'Nistha',
                checked : false
            }
        }
        static getDerivedStateFromProps(){
            console.log('GetDerivedStateFromProps Child');
            return null;
        }
        render(){
            console.log('Render Child')
                return(                  
                      <h1>{this.state.name}</h1>
                )   
            return <h1>Checked is false</h1>   
        }
            componentDidMount(){
                console.log('Component Did Mount Child')
            }
    
            shouldComponentUpdate(){
                console.log('Should Component Update')
                return true;
            }
    
            getSnapshotBeforeUpdate(){
                console.log('Get Snapshot Before Update Child') 
                return "SnapshotData";
            }
    
            componentDidUpdate(props,state,Snapshot){
                console.log('Component Updated Child') 
                console.log('Snapshot data is : '+Snapshot)
            }
    
            changeName(){
                this.setState({
                    name : 'Nishu'
                })
            }
    }

    ReactDOM.render(<div><Lifecycle/></div> ,document.getElementById('app'))
