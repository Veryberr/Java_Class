# 주석
-- 이것도 주석
# INSERT INTO 테이블이름(필드이름, ...) VALUES (데이터, ...);
INSERT INTO memo(NAME, PASSWORD, MEMO) VALUES ('홍길동', '1111', '1등 입니다.');
INSERT INTO memo(NAME, PASSWORD, MEMO) VALUES ('임꺽정', '2222', '2등 입니다.');
INSERT INTO memo(NAME, PASSWORD, MEMO) VALUES ('장길산', '3333', '3등 입니다.');
INSERT INTO memo(NAME, PASSWORD, MEMO) VALUES ('일지매', '4444', '4등 입니다.');
INSERT INTO memo(NAME, PASSWORD, MEMO) VALUES ('길홍동', '5555', '5등 입니다.');
INSERT INTO memo(NAME, PASSWORD, MEMO) VALUES ('홍동길', '3333', '6등 입니다.');

# SELECT [DISTINCT] 필드이름 또는 *(모든 필드) FROM 테이블이름;`name``memo`
SELECT * FROM MEMO; # memo 테이블의 모든 필드 검색 
SELECT NAME, memo FROM memo; # memo 테이블의 name, memo 필드 검색
# DISTINCT 옵션은 중복되는 데이터는 1번만 출력한다.
SELECT DISTINCT NAME FROM memo; 

# SELECT * FROM 테이블이름 ORDER BY 필드이름 [ASC/DESC];
# ORDER BY: 지정된 필드를 기준을 정렬한다.
# 정렬 방식 생략시 ASC가 기본값으로 사용되며 오름차순으로 정렬되고 DESC를 사용하면 내림차순으로 정렬된다.
SELECT * FROM MEMO ORDER BY NAME; # name 필드에 저장된 값의 오름차순으로 정렬된다.
SELECT * FROM MEMO ORDER BY NAME ASC; # name 필드에 저장된 값의 오름차순으로 정렬된다.
SELECT * FROM MEMO ORDER BY idx DESC; # idx 필드에 저장된 값의 내림차순으로 정렬된다.(최신글 순으로 정렬)
# name 필드의 오름차순 정렬, name이 같으면 idx를 내림차순으로 정렬한다.
SELECT * FROM MEMO ORDER BY NAME ASC, idx DESC;

# SELECT * FROM 테이블이름 WHERE 조건식;
# WHERE 뒤의 조건에 만족하는 데이터만 검색한다.
# 조건의 종류는 AND, OR, LIKE(부분일치)가 있다.

# 단순 조건 - 조건이 1개
SELECT * FROM MEMO WHERE IDX = 15; # 같다 조건은 '='을 1개만 사용해야 한다.
SELECT * FROM MEMO WHERE NAME = '홍길동'; 

# 복합 조건 - 조건이 여러개
SELECT * FROM MEMO WHERE IDX >= 5 && IDX <= 10;
SELECT * FROM MEMO WHERE IDX >= 15 AND IDX <= 20;
# BETWEEN 연산자 ~이상이고 ~이하인 데이터를 얻어올 수 있다. 이상, 이하 조건만 가능하다.
SELECT * FROM MEMO WHERE IDX BETWEEN 25 AND 30;

SELECT * FROM MEMO WHERE NAME='홍길동' || NAME='임꺽정';
SELECT * FROM MEMO WHERE NAME='장길산' OR NAME='일지매';

# IN 연산자: () 내부에 있는 데이터만 얻어온다.
SELECT * FROM MEMO WHERE NAME IN ('홍길동','임꺽정','장길산');
# NOT IN 연산자: () 내부에 없는 데이터만 얻어온다.
SELECT * FROM MEMO WHERE NAME NOT IN ('홍길동','임꺽정','장길산');

# 부분일치 조건 - 와일드카드(대체) 문자와 같이 사용한다.
# 와일드카드 문자는 '_'와 '%'가 있고 '_'는 1문자를 '%'는 여러 문자를 대체할 수 있다.
# '종로_가'는 종로1가, 종로2가, 종로3가, 종로4가, 종로5가, 종로6가 처럼 '_' 자리에 어떤 문자가 나와도 상관없다.
# '_'는 글자수를 제한하는 조건에도 사용된다. '김__' => '김'으로 시작하는 3글자
# '홍%' => '홍'으로 시작하는
# '%홍' => '홍'으로 끝나는
# '%홍%' => '홍'을 포함하는 
SELECT * FROM memo WHERE NAME LIKE '홍%';
SELECT * FROM memo WHERE NAME LIKE '%매';
SELECT * FROM memo WHERE NAME LIKE '%길%';

# LIMIT를 사용해서 특정 index 부터 원하는 개수를 지정해서 검색할 수 있다.
# index는 select sql 명령을 실행했을 때 출력 결과의 1번째 데이터의 index가 0부터 시작된다.
# 오라클은 index가 1부터 시작된다.
# LIMIT 시작인덱스, 개수
SELECT * FROM memo ORDER BY idx DESC LIMIT 0, 10; # 1페이지 분량의 글 목록을 얻어온다.

# 그룹 함수: SUM(합계), AVG(평균), MAX(최대값), MIN(최소값), COUNT(개수)
SELECT SUM(idx) FROM memo WHERE idx <= 10;
SELECT AVG(idx) FROM memo WHERE idx <= 10;
SELECT MAX(idx) FROM memo WHERE idx <= 10;
SELECT MIN(idx) FROM memo WHERE idx <= 10;
SELECT COUNT(idx) FROM memo WHERE idx <= 10;
# 개수는 어떤 필드의 개수를 세더라도 같은 결과가 나오기 때문에 인수로 '*'를 사용한다.
SELECT COUNT(*) FROM memo WHERE idx <= 10;
SELECT COUNT(*) FROM memo;
# 그룹 함수를 실행한 결과나 필드 이름이 너무 길어서 다른 이름으로 변경해서 보려면 'as' 예약어를 사용해서
# 별명을 지정할 수 있다.
SELECT COUNT(*) AS '인원수' FROM memo;

# GROUP BY를 사용해서 그룹화를 할 수 있다. => 그룹별 소계
# SELECT 그룹함수(필드이름) FROM 테이블이름 WHERE 전체조건 GROUP BY 그룹화할필드이름 [HAVING 그룹조건];
SELECT COUNT(*) FROM memo; # 테이블에 저장된 전체 데이터 개수를 얻어온다.
SELECT NAME, COUNT(*) FROM memo;
SELECT NAME, COUNT(*) FROM memo GROUP BY NAME; # name 별로 그룹화 해서 name 별로 개수를 얻어온다.
# name 별로 그룹화 해서 name에 '길'을 포함한 데이터만 name 별로 개수를 얻어온다.
SELECT NAME, COUNT(*) FROM memo GROUP BY NAME HAVING NAME LIKE '%길%';

SELECT * FROM memo;

# UPDATE 테이블이름 SET 수정할내용[, 수정할내용, ...] [WHERE 조건식];
UPDATE memo SET PASSWORD = '7777';
UPDATE memo SET PASSWORD = '1111' WHERE NAME = '홍길동';
UPDATE memo SET PASSWORD = '2222' WHERE NAME = '임꺽정';
UPDATE memo SET PASSWORD = '3333' WHERE NAME = '장길산';
UPDATE memo SET PASSWORD = '4444' WHERE NAME = '일지매';

# DELETE FROM 테이블이름 [WHERE 조건식];
DELETE FROM memo WHERE NAME = '임꺽정';
DELETE FROM memo;

# 자동 증가를 1부터 다시 시작하기 => 테이블에 데이터가 없어야 한다.
DELETE FROM memo;
ALTER TABLE memo AUTO_INCREMENT = 1;






