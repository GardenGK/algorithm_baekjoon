-- 코드를 입력하세요
SELECT 
MEMBER_ID, MEMBER_NAME, GENDER, TO_char(DATE_OF_BIRTH, 'YYYY-MM-DD') as DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE TLNO IS NOT NULL
ANd TO_char(DATE_OF_BIRTH, 'YYYY-MM-DD') like '%-03-%'
AND GENDER = 'W'

ORDER BY MEMBER_ID ASC;