-- Drop the tables if they exist
DROP TABLE IF EXISTS beer_category;
DROP TABLE IF EXISTS category;

-- Create the category table
CREATE TABLE category
(
    id VARCHAR(36) PRIMARY KEY NOT NULL,
    description VARCHAR(50),
    created_date TIMESTAMP,
    last_modified_date TIMESTAMP DEFAULT NULL,
    version BIGINT DEFAULT NULL
);

-- Create the beer_category table
CREATE TABLE beer_category
(
    beer_id VARCHAR(36) NOT NULL,
    category_id VARCHAR(36) NOT NULL,
    PRIMARY KEY (beer_id, category_id),
    FOREIGN KEY (beer_id) REFERENCES beer (id),
    FOREIGN KEY (category_id) REFERENCES category (id)
);
