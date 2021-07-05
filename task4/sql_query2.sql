SELECT customer.cust_id, customer.fed_id, product.name FROM customer, product
WHERE customer.cust_type_cd='I';