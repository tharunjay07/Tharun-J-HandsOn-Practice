-- Create or replace procedure to update employee bonuses by department
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  dept           IN VARCHAR2,
  bonus_percent  IN NUMBER
) IS
BEGIN
  UPDATE employees
  SET salary = salary + (salary * bonus_percent / 100)
  WHERE department = dept;

  COMMIT;
END;
/
