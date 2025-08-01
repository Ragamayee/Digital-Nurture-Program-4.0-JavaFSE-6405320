import React, { useState } from 'react';
import './App.css';

function App() {
  const [counter, setCounter] = useState(0);
  const [rupees, setRupees] = useState('');
  const [converted, setConverted] = useState(null);

  const increment = () => {
    setCounter(prev => prev + 1);
    sayHello();
  };

  const sayHello = () => {
    alert('Hello, Member');
  };

  const decrement = () => {
    setCounter(prev => prev - 1);
  };

  const sayWelcome = () => {
    alert(`Welcome`);
  };

  const handleOnPress = (e) => {
    e.preventDefault();
    alert('I was clicked');
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const euroRate = 0.011;
    const convertedAmount = (parseFloat(rupees) * euroRate).toFixed(2);
    setConverted(`€ ${convertedAmount}`);
    alert(`Converted Amount is € ${convertedAmount}`);
  };

  return (
    <div className="App">
      <h2>Counter: {counter}</h2>
      <button onClick={increment}>Increment</button><br />
      <button onClick={decrement}>Decrement</button><br />

      <button onClick={sayWelcome}>Say Welcome</button><br />

      <button onClick={handleOnPress}>Click On</button><br /><br />

      <CurrencyConvertor
        rupees={rupees}
        setRupees={setRupees}
        handleSubmit={handleSubmit}
      />
    </div>
  );
}

function CurrencyConvertor({ rupees, setRupees, handleSubmit }) {
  return (
    <div>
      <h2>Currency Converter</h2>
      <form onSubmit={handleSubmit}>
        <label>Enter Amount in Rupees:</label><br />
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
        /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default App;
