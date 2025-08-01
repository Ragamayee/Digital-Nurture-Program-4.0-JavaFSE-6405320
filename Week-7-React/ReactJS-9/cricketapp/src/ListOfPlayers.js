import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat Kohli', score: 100 },
    { name: 'Rohit Sharma', score: 85 },
    { name: 'KL Rahul', score: 65 },
    { name: 'Shubman Gill', score: 40 },
    { name: 'MS Dhoni', score: 75 },
    { name: 'Ravindra Jadeja', score: 55 },
    { name: 'Hardik Pandya', score: 90 },
    { name: 'Bumrah', score: 30 },
    { name: 'Shami', score: 80 },
    { name: 'Surya Yadav', score: 70 },
    { name: 'Ishan Kishan', score: 60 }
  ];

  const below70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h3>Players with Score below 70</h3>
      <ul>
        {below70.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
