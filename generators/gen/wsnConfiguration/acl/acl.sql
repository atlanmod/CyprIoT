CREATE TABLE  IF NOT EXISTS acls ( id INTEGER AUTO_INCREMENT, username VARCHAR(25) NOT NULL, topic VARCHAR(256) NOT NULL, rw INTEGER(1) NOT NULL DEFAULT 1, PRIMARY KEY (id) );
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT fr.imt.dapi.roomA246:242210936, 'fr/imt/dapi/roomA246/room1', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = fr.imt.dapi.roomA246:242210936 AND topic='fr/imt/dapi/roomA246/room1' AND rw=2
) LIMIT 1;
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT fr.imt.dapi.roomA246:242210936, 'fr/imt/dapi/roomA246/room2', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = fr.imt.dapi.roomA246:242210936 AND topic='fr/imt/dapi/roomA246/room2' AND rw=2
) LIMIT 1;
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT fr.imt.dapi.roomA246:19640852, 'fr/imt/dapi/roomA246/room2', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = fr.imt.dapi.roomA246:19640852 AND topic='fr/imt/dapi/roomA246/room2' AND rw=2
) LIMIT 1;
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT fr.imt.dapi.roomA246:19640852, 'fr/imt/dapi/roomA246/room3', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = fr.imt.dapi.roomA246:19640852 AND topic='fr/imt/dapi/roomA246/room3' AND rw=2
) LIMIT 1;
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT fr.imt.dapi.roomA246:19640852, 'fr/imt/dapi/roomA246/room4', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = fr.imt.dapi.roomA246:19640852 AND topic='fr/imt/dapi/roomA246/room4' AND rw=2
) LIMIT 1;
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT fr.imt.dapi.roomA246:56857574, 'fr/imt/dapi/roomA246/room1', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = fr.imt.dapi.roomA246:56857574 AND topic='fr/imt/dapi/roomA246/room1' AND rw=2
) LIMIT 1;
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT fr.imt.dapi.roomA246:56857574, 'fr/imt/dapi/roomA246/room3', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = fr.imt.dapi.roomA246:56857574 AND topic='fr/imt/dapi/roomA246/room3' AND rw=2
) LIMIT 1;
 
INSERT INTO acls (username,topic,rw)
SELECT * FROM (SELECT fr.imt.dapi.roomA246:56857574, 'fr/imt/dapi/roomA246/room4', 2) AS tmp
WHERE NOT EXISTS (
    SELECT username FROM acls WHERE username = fr.imt.dapi.roomA246:56857574 AND topic='fr/imt/dapi/roomA246/room4' AND rw=2
) LIMIT 1;
 
