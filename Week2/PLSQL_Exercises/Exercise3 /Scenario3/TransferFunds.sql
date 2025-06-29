CREATE OR REPLACE PROCEDURE TransferFunds (
  src_id     IN NUMBER,
  dest_id    IN NUMBER,
  trans_amt  IN NUMBER
) IS
  bal NUMBER;
BEGIN
  SELECT balance INTO bal
  FROM accounts
  WHERE accountid = src_id;

  IF bal < trans_amt THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient amount to perform transaction');
  END IF;

  UPDATE accounts
  SET balance = balance - trans_amt
  WHERE accountid = src_id;

  UPDATE accounts
  SET balance = balance + trans_amt
  WHERE accountid = dest_id;

  COMMIT;
END;
/
