ALTER TABLE customers ADD isVip VARCHAR2(5);

BEGIN
  FOR rec IN (SELECT customerid FROM customers WHERE balance > 10000) LOOP
    UPDATE customers
    SET isVip = 'true'
    WHERE customerid = rec.customerid;
  END LOOP;

  COMMIT;
END;
/
