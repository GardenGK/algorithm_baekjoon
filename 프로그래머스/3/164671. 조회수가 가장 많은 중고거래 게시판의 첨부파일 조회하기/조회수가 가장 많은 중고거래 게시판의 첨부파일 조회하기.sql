
SELECT '/home/grep/src/' || BOARD.BOARD_ID || '/' || FIL.FILE_ID
|| FILE_NAME || FILE_EXT AS FILE_PATH
FROM USED_GOODS_BOARD BOARD JOIN USED_GOODS_FILE FIL
ON BOARD.BOARD_ID = FIL.BOARD_ID
WHERE BOARD.VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD)
ORDER BY FIL.FILE_ID DESC;