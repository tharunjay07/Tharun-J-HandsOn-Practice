DECLARE
    CURSOR cur_discount IS
        SELECT l.LoanID
        FROM Customers c
        INNER JOIN Loans l ON c.CustomerID = l.CustomerID
        WHERE FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) > 60;

BEGIN
    FOR rec IN cur_discount LOOP
        UPDATE Loans
        SET InterestRate = InterestRate * 0.99
        WHERE LoanID = rec.LoanID;
    END LOOP;

    COMMIT;
END;
/
