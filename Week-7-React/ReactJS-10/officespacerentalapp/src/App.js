// src/App.js
import React from 'react';
import './App.css';


function App() {
  const officeList = [
    {
      id: 1,
      name: "WeWork",
      rent: 75000,
      address: "Street 3, Delhi",
      image: "/image-1.jpg"
    },
    {
      id: 2,
      name: "Green Spaces",
      rent: 58000,
      address: "Sector 2, Mumbai",
      image: "/image-2.jpg"
    },
    {
      id: 3,
      name: "Smartworks",
      rent: 62000,
      address: "Koramangala, Bangalore",
      image: "/image-3.jpg"
    }
  ];

  return (
    <div className="App">
      <h1>Office Space Rental App</h1>

      {officeList.map((office) => (
        <div key={office.id}>
          <h2>{office.name}</h2>
          <img style={{ height: '500px', width: '1000px' }} src={office.image} alt={office.name} />
          <p>
            <strong>Rent: </strong>
            <span
              style={{
                color: office.rent < 60000 ? 'red' : 'green',
                fontWeight: 'bold'
              }}
            >
              ₹{office.rent}
            </span>
          </p>
          <p><strong>Address:</strong> {office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
