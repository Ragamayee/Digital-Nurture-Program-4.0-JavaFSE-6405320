import React, { Component } from 'react';
import Cart from './Cart'; 
class OnlineShopping extends Component {
  constructor(props) {
    super(props);

    this.state = {
      cartItems: [
        new Cart('Laptop', 55000),
        new Cart('Headphones', 1500),
        new Cart('Smartphone', 20000),
        new Cart('Keyboard', 1200),
        new Cart('Mouse', 800),
      ],
    };
  }

  render() {
    return (
      <div>
        <h2>Online Shopping Cart</h2>
        <table border="1" cellPadding="10" style={{ borderCollapse: 'collapse' }}>
          <thead>
            <tr>
              <th>Item Name</th>
              <th>Price (₹)</th>
            </tr>
          </thead>
          <tbody>
            {this.state.cartItems.map((item, index) => (
              <tr key={index}>
                <td>{item.itemName}</td>
                <td>{item.price}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default OnlineShopping;
