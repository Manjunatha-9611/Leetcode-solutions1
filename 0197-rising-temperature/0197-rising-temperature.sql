# Write your MySQL query statement below
select w.id from weather w inner join weather w1 on datediff(w.recordDate,w1.recordDate) = 1 where w.temperature > w1.temperature;