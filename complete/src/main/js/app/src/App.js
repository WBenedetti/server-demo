import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import {BootstrapTable, TableHeaderColumn} from 'react-bootstrap-table';

function imageFormatter(cell, row){
	  return "<img src='"+cell+"'/>" ;
	}

class App extends Component {
  state = {
    isLoading: true,
    groups: []
  };

  async componentDidMount() {
    const response = await fetch('/api/products');
    const body = await response.json();
    let filtered = [];
    body.map(product => {
    	if(product.available) {
    		filtered.push(product)
    	}
    })
    this.setState({ products: filtered, isLoading: false });
  }

  render() {
    const {products, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }

    return (
      <div className="App">
        <header className="App-header">
          <h1 className="App-title">GRUB</h1>
        </header>
        <div className="App-intro">
          <BootstrapTable data={products}>
	          <th dataField='menuname' isKey>Name</th>
	          <th dataField='comboprice'>Combo</th>
	          <th dataField='eachprice'>Each</th>
	          <th dataField='image' dataFormat={imageFormatter}>Image</th>
          </BootstrapTable>
        </div>
      </div>
    );
  }
}

export default App;