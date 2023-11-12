DROP TABLE IF EXISTS beer_order_line;
DROP TABLE IF EXISTS beer_order;

CREATE TABLE beer_order
(
    id                 VARCHAR(36) PRIMARY KEY,
    created_date       TIMESTAMP DEFAULT NULL,
    customer_ref       VARCHAR(255) DEFAULT NULL,
    last_modified_date TIMESTAMP DEFAULT NULL,
    version            BIGINT DEFAULT NULL,
    customer_id        VARCHAR(36) DEFAULT NULL,
    CONSTRAINT customer_id_fk FOREIGN KEY (customer_id) REFERENCES customer (id)
);

CREATE TABLE beer_order_line
(
    id                 VARCHAR(36) PRIMARY KEY,
    beer_id            VARCHAR(36) DEFAULT NULL,
    created_date       TIMESTAMP DEFAULT NULL,
    last_modified_date TIMESTAMP DEFAULT NULL,
    order_quantity     INT DEFAULT NULL,
    quantity_allocated INT DEFAULT NULL,
    version            BIGINT DEFAULT NULL,
    beer_order_id      VARCHAR(36) DEFAULT NULL,
    CONSTRAINT beer_order_id_fk FOREIGN KEY (beer_order_id) REFERENCES beer_order (id),
    CONSTRAINT beer_id_fk FOREIGN KEY (beer_id) REFERENCES beer (id)
);
