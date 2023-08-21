SELECT w2.id AS id FROM Weather w1, Weather w2 WHERE w2.id != w1.id AND w2.temperature > w1.temperature AND w1.recordDate = w2.recordDate - INTERVAL 1 DAY;
