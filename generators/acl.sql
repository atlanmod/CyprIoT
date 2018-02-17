CREATE TABLE  IF NOT EXISTS acls ( id INTEGER AUTO_INCREMENT, username VARCHAR(25) NOT NULL, topic VARCHAR(256) NOT NULL, rw INTEGER(1) NOT NULL DEFAULT 1, PRIMARY KEY (id) );
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT 242210936, 'room1', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = 242210936 AND topic='room1' AND rw=2
) LIMIT 1;
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT 242210936, 'room2', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = 242210936 AND topic='room2' AND rw=2
) LIMIT 1;
 
