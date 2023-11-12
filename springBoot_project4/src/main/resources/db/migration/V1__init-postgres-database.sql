-- Drop the tables if they exist
DROP TABLE IF EXISTS beer;
DROP TABLE IF EXISTS customer;

-- Create the Beer table
CREATE TABLE beer (
                      id varchar(36) PRIMARY KEY ,
                      version INT,
                      beer_name VARCHAR(50) NOT NULL,
                      beer_style SMALLINT NOT NULL,
                      upc VARCHAR(255) NOT NULL,
                      quantity_on_hand INT,
                      price NUMERIC(19, 2) NOT NULL,
                      created_date TIMESTAMP,
                      update_date TIMESTAMP
);

-- Create the Customer table
CREATE TABLE customer (
                          id varchar(36) PRIMARY KEY ,
                          name VARCHAR,
                          version INT,
                          created_date TIMESTAMP,
                          update_date TIMESTAMP
);
