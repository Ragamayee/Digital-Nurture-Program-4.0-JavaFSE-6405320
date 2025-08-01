import React from 'react';
import ListofPlayers from './ListOfPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
  const flag = false; 

  return (
    <div className="App">
      <h1>Welcome to Cricket App</h1>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
