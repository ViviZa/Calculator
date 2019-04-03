const React = require('react');
const ReactDOM = require('react-dom');
import Calculator from './Calculator'

class App extends React.Component {

    constructor(props) {
        super(props);
    }

    render() {
        return (
        <div>
            <h1>Calculator</h1>
            <Calculator/>
        </div>
        )
    }
}
ReactDOM.render(
    <App />,
    document.getElementById('react')
)