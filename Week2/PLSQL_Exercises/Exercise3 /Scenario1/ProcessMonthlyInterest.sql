CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE accounts
  SET balance = balance + (balance * 0.01)
  WHERE accounttype = 'savings';
  
  COMMIT;
END;
/
EXEC ProcessMonthlyInterest;
