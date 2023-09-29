-- 코드를 입력하세요
SELECT 
A.TITLE, 
A.BOARD_ID, 
B.REPLY_ID, 
B.WRITER_ID, 
B.CONTENTS, 
TO_CHAR(B.CREATED_DATE,'YYYY-MM-DD') AS CREATED_DATE
FROM USED_GOODS_BOARD A, USED_GOODS_REPLY B
WHERE
A.BOARD_ID = B.BOARD_ID
AND 
A.CREATED_DATE
between to_date('2022-10-01', 'yyyy-mm-dd') and to_date('2022-10-31', 'yyyy-mm-dd')
order by b.created_date asc, a.title asc
--댓글작성일 오름차순, 게시글제목 오름차순