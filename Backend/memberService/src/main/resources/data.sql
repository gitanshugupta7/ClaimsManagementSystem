

CREATE TABLE Bills(mid varchar(20), lastPaidDate date, dueAmount int, lateCharge int, dueDate date, pid varchar(20));

INSERT INTO Bills(mid, lastPaidDate, dueAmount, lateCharge, dueDate, pid) VALUES ('M101', '2020-06-01', 0, 800, '2020-02-01',  'P101');
INSERT INTO Bills(mid, lastPaidDate, dueAmount, lateCharge, dueDate, pid) values('M102', '2019-12-10', 0, 6500, '2120-12-10', 'P103');
INSERT INTO Bills(mid, lastPaidDate, dueAmount, lateCharge, dueDate, pid) values('M103', '2021-07-20', 12000, 0, '2122-07-30', 'P104');
INSERT INTO Bills(mid, lastPaidDate, dueAmount, lateCharge, dueDate, pid) values('M104', '2021-01-01', 8000, 0, '2121-08-10', 'P102;');
INSERT INTO Bills(mid, lastPaidDate, dueAmount, lateCharge, dueDate, pid) values('M105', '2020-01-05', 25000, 4000, '2121-07-05', 'P103');