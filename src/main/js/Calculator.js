const React = require('react');
const ReactDOM = require('react-dom');

class Calculator extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            val1 : 3,
            val2 : 3,
            result : 0,
            operation : ''
            };
         this.handleInputChange = this.handleInputChange.bind(this);
         this.calculate = this.calculate.bind(this);
    }

    handleInputChange(event) {
        const target = event.target;
        const value = target.value;
        const name = target.name;

        this.setState({
          [name]: value
        });
  }

    calculate(event) {
        var current = parseInt(this.state.val1) + parseInt(this.state.val2);
        this.setState({
                  result: current
                });
        event.preventDefault();
    }

    render() {
        return (
            <div>
                <h4>Enter the values and choose the wanted calculation</h4>
                 <form onSubmit={this.calculate}>
                        <label>
                          Numbers:
                          <input name="val1" type="number" value={this.state.val1} onChange={this.handleInputChange}/>
                          <input name="val2" type="number" value={this.state.val2} onChange={this.handleInputChange}/>
                        </label>
                        <br/>
                        <input type="submit" value="+" />
                 </form>
                 <br/>
                <div className="result">{this.state.result}</div>
            </div>
        )
    }

}
export default Calculator;