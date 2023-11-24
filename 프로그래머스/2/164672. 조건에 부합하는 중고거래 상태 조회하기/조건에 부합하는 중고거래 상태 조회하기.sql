-- 코드를 입력하세요
SELECT BOARD_ID,	WRITER_ID,	TITLE,	PRICE,	
CASE  WHEN status = 'SALE' THEN '판매중' 
      WHEN status='RESERVED' THEN '예약중' 
    WHEN STATUS='DONE' THEN '거래완료'
    else status
    end
from USED_GOODS_BOARD
where to_char(CREATED_DATE,'YYYY-MM-DD') = '2022-10-05'
ORDER BY BOARD_ID DESC