const React = require('react');
const ReactDOM = require('react-dom');

class Calculator extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            val1 : 0,
            val2 : 0,
            result : "",
            };
         this.handleInputChange = this.handleInputChange.bind(this);
         this.handleClick = this.handleClick.bind(this);
    }

    handleInputChange(event) {
        const target = event.target;
        const value = target.value;
        const name = target.name;

        this.setState({
          [name]: value
        });
    }

    handleClick(operation) {
        var current = 0;
        if(operation == "+") { current = parseInt(this.state.val1) + parseInt(this.state.val2); }
        if(operation == "-") { current = parseInt(this.state.val1) - parseInt(this.state.val2); }
        if(operation == "*") { current = parseInt(this.state.val1) * parseInt(this.state.val2); }
        if(operation == "/") { current = parseInt(this.state.val1) / parseInt(this.state.val2); }

        this.setState({
           result: current
        });
    }

    render() {
        return (
            <div className="calculator-view">
                <h4 className="headline">Enter the values and choose the wanted calculation</h4>
                Numbers:
                <form>
                    <input name="val1" type="number" value={this.state.val1} onChange={this.handleInputChange}/>
                    <input name="val2" type="number" value={this.state.val2} onChange={this.handleInputChange}/>
                </form>
                <br/>
                <button onClick={() => this.handleClick("+")}>+</button>
                <button onClick={() => this.handleClick("-")}>-</button>
                <button onClick={() => this.handleClick("*")}>*</button>
                <button onClick={() => this.handleClick(":")}>:</button>
                <br/>
                <div className="result">{this.state.result}</div>
            </div>
        )
    }
}
export default Calculator;