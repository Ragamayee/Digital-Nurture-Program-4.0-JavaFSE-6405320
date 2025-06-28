SELECT *
    FROM Customers c
    JOIN Loans l ON c.CustomerID = l.CustomerID
    WHERE MONTHS_BETWEEN(SYSDATE, c.DOB) / 12 > 60

