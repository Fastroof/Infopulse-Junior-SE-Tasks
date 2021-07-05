SELECT account_id, cust_id, avail_balance FROM account
WHERE status='ACTIVE' AND avail_balance>1000;