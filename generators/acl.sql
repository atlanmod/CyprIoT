CREATE TABLE  IF NOT EXISTS acls ( id INTEGER AUTO_INCREMENT, username VARCHAR(25) NOT NULL, topic VARCHAR(256) NOT NULL, rw INTEGER(1) NOT NULL DEFAULT 1, PRIMARY KEY (id) );
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT fr:imt:dapi:roomA246:140162625, 'room1', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = fr:imt:dapi:roomA246:140162625 AND topic='room1' AND rw=2
) LIMIT 1;
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT fr:imt:dapi:roomA246:140162625, 'room2', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = fr:imt:dapi:roomA246:140162625 AND topic='room2' AND rw=2
) LIMIT 1;
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT fr:imt:dapi:roomA246:27975923, 'room2', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = fr:imt:dapi:roomA246:27975923 AND topic='room2' AND rw=2
) LIMIT 1;
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT fr:imt:dapi:roomA246:27975923, 'room3', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = fr:imt:dapi:roomA246:27975923 AND topic='room3' AND rw=2
) LIMIT 1;
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT fr:imt:dapi:roomA246:27975923, 'room4', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = fr:imt:dapi:roomA246:27975923 AND topic='room4' AND rw=2
) LIMIT 1;
 
