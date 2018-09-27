import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

const React = require("react")
const logo = require("./logo.svg")

class App extends Component {
  state = {
    isLoading: true,
    groups: []
  };

  async componentDidMount() {
    const response = await fetch('/api/products');
    const body = await response.json();
    this.setState({ products: body, isLoading: false });
  }

  render() {
    const {products, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }

    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <div className="App-intro">
          <h2>JUG List</h2>
          {products.map(product =>
            <div key={product.id}>
              {product.menuname}
            </div>
          )}
        </div>
      </div>
    );
  }
}

export default App;