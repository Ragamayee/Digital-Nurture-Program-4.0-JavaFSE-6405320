import React from 'react';

const IndianPlayers = () => {
  const allPlayers = ['Virat', 'Rohit', 'Rahul', 'Dhoni', 'Jadeja', 'Bumrah', 'Gill', 'Pant'];

  const oddTeam = allPlayers.filter((_, index) => index % 2 === 0);
  const evenTeam = allPlayers.filter((_, index) => index % 2 !== 0);

  const [T20Players] = [['Raina', 'Iyer', 'Samson']];
  const [RanjiPlayers] = [['Pujara', 'Rahane', 'Shaw']];

  const mergedPlayers = [...T20Players, ...RanjiPlayers]; // ES6 merge

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Merged Players (T20 + Ranji)</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
