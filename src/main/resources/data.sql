DROP TABLE IF EXISTS clients;

CREATE TABLE clients (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  user_name VARCHAR(250) NOT NULL,
  account_number BIGINT  NOT NULL,
  balance INT default NULL
);

INSERT INTO clients (user_name, account_number, balance) VALUES
  ('Alex', 123456789011121, 5000),
  ('Bill', 123456789014152, 72356),
  ('Folrunsho', 123456789017189, 36798);