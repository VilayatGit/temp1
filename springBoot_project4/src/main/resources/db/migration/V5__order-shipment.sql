-- Drop the table if it exists
DROP TABLE IF EXISTS beer_order_shipment;

-- Create the table beer_order_shipment
CREATE TABLE beer_order_shipment
(
    id VARCHAR(36) NOT NULL PRIMARY KEY,
    beer_order_id VARCHAR(36) UNIQUE,
    tracking_number VARCHAR(50),
    created_date TIMESTAMP,
    last_modified_date TIMESTAMP DEFAULT NULL,
    version BIGINT DEFAULT NULL,
    CONSTRAINT bos_pk FOREIGN KEY (beer_order_id) REFERENCES beer_order (id)
);

-- Alter the table beer_order to add the column beer_order_shipment_id
ALTER TABLE beer_order
    ADD COLUMN beer_order_shipment_id VARCHAR(36);

-- Add a foreign key constraint on beer_order_shipment_id
ALTER TABLE beer_order
    ADD CONSTRAINT bos_shipment_fk
        FOREIGN KEY (beer_order_shipment_id) REFERENCES beer_order_shipment (id);
