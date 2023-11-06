CREATE TABLE pension (
NO number(2,0),
name varchar2(100),
numberOfPeople number(2,0),
price number(6,0),
checkIn DATE,
checkOut DATE,
loc varchar2(50));

INSERT INTO pension VALUES (
1, '러브펜션', 4, 200000,
to_date('2023-11-10','YYYY-MM-DD'),
to_date('2023-11-10','YYYY-MM-DD'),
'가평'); --6~10일 가능 

INSERT INTO pension VALUES (
2, '희망펜션', 2, 180000,
to_date('2023-11-12','YYYY-MM-DD'),
to_date('2023-11-12','YYYY-MM-DD'),
'가평'); --11,12일 가능

INSERT INTO pension VALUES (
3, '평화펜션', 4, 220000,
to_date('2023-11-12','YYYY-MM-DD'),
to_date('2023-11-12','YYYY-MM-DD'),
'가평'); --6 , 8,10,12

INSERT INTO pension VALUES (
4, '지옥펜션', 6, 150000,
to_date('2023-11-10','YYYY-MM-DD'),
to_date('2023-11-10','YYYY-MM-DD'),
'가평'); --10,11,12 가능 

SELECT * FROM PENSION p 
WHERE loc = '가평' AND checkIn >= '2023-11-10' AND checkOut <= '2023-11-12' AND NUMBEROFPEOPLE =6;