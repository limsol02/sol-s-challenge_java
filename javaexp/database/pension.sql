CREATE TABLE pension (
NO number(2,0),
name varchar2(100),
numberOfPeople varchar2(100),
price varchar2(100),
checkIn varchar2(100),
checkOut varchar2(100),
loc varchar2(50));

INSERT INTO pension VALUES (
1, '러브펜션', '4', '200000','2023-11-10','2023-11-10','가평'); --6~10일 가능 

INSERT INTO pension VALUES (
2, '희망펜션', '2', '180000','2023-11-12','2023-11-12','가평'); --11,12일 가능

INSERT INTO pension VALUES (
3, '평화펜션', '4', '220000','2023-11-12','2023-11-12','가평'); --6 , 8,10,12

INSERT INTO pension VALUES (
4, '지옥펜션', '6', '150000','2023-11-12','2023-11-12','가평'); --10,11,12 가능 

SELECT * FROM PENSION p 
WHERE loc LIKE '%가평%' AND checkIn LIKE '%10%' AND NUMBEROFPEOPLE LIKE '%6%';
-- AND checkIn LIKE '%11-10%' AND CHECKOUT LIKE '%11-12%' AND NUMBEROFPEOPLE LIKE '%6%' CHECKOUT LIKE '%12%'