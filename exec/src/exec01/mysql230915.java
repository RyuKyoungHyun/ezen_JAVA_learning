package exec01;

public class mysql230915 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		use scott;
//
//		-- 테이블생성
//		create table dept_temp
//			as select * from dept;
//		-- 테이블제거
//		drop table dept_temp;
//
//		select *
//			from dept_temp;
//
//		create table emp_temp
//			as select * from emp;
//		-- 데이터 넣기
//		insert into dept_temp (deptno, dname, loc)
//					values ( 50, 'DATABASE', 'SEOUL');
//
//		SELECT *
//			FROM DEPT_TEMP;
//
//		INSERT INTO DEPT_TEMP
//					VALUES (60, 'NETWORK', 'BUSAN');
//		SELECT *
//			FROM DEPT_TEMP;
//		    
//		-- NULL 입력하기
//		INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
//					VALUES (70, 'WEB', NULL);
//		SELECT *
//			FROM DEPT_TEMP;
//		    
//		INSERT INTO DEPT_TEMP (DEPTNO, LOC)
//					VALUES (90, 'INCHEON');
//
//		INSERT INTO DEPT_TEMP (DEPTNO, LOC ,DNAME)
//					VALUES (99, 'MADRID', 'RAUL');
//		SELECT *
//			FROM DEPT_TEMP;
//
//		-- 삭제
//		DELETE FROM SCOTT.DEPT_TEMP
//			WHERE LOC = 'MADRID';
//		-- 일시적인 세이프모드 해제/잠금
//		SET SQL_SAFE_UPDATES = 0;
//		SET SQL_SAFE_UPDATES = 1;
//
//		SELECT * 
//			FROM EMP_TEMP;
//		    
//		CREATE TABLE DEPT_TEMP2
//			AS SELECT * FROM DEPT;
//		DROP TABLE DEPT_TEMP2;
//		SELECT *
//			FROM DEPT_TEMP2;
//		UPDATE DEPT_TEMP2
//			SET LOC = 'SEOUL';
//
//		UPDATE DEPT_TEMP2
//			SET DNAME = 'DATABASE' ,
//				LOC = 'SEOUL'
//		WHERE DEPTNO = 40;
//
//		-- EMP_TEMP 테이블의 사원들 중에서 급여가 2500이하인 사원만 추가 수당을 50으로 수정하는 SQL
//		SELECT *
//			FROM EMP_TEMP
//		order by sal;
//
//		DROP TABLE EMP_TEMP;
//
//		UPDATE EMP_T EMP
//			SET COMM = 50
//		WHERE SAL <= 2500;
//
//		-- EMP_TEMP 테이블에서 급여가 3000 이상인 사원을 삭제하는 SQL
//
//		DELETE FROM EMP_TEMP
//			WHERE SAL >= 3000;
//
//		CREATE TABLE CHAP10HW_EMP AS SELECT * FROM EMP;
//		CREATE TABLE CHAP10HW_DEPT AS SELECT * FROM DEPT;
//		CREATE TABLE CHAP10HW_SALGRADE AS SELECT * FROM SALGRADE;
//
//		-- 1
//		INSERT INTO chap10hw_dept
//					VALUES (50, 'ORACLE', 'BUSAN');
//		INSERT INTO chap10hw_dept
//					VALUES (60, 'SQL', 'ILSAN');
//		INSERT INTO chap10hw_dept
//					VALUES (70, 'SELECT', 'INCHEON');
//		INSERT INTO chap10hw_dept
//					VALUES (80, 'DML', 'BUNDANG');
//		-- 2
//		SELECT *
//			FROM chap10hw_dept;
//		SELECT *
//			FROM chap10hw_EMP;
//		SELECT SUBSTR(ENAME, 1)
//			FROM CHAP10HW_EMP;
//		DELETE FROM chap10hw_emp
//			WHERE SUBSTR(ENAME, 1,4) = 'TEST';
//		INSERT INTO chap10hw_emp
//					VALUES (7201, 'TEST_USER1', 'MANAGER', 7788, '2016-01-02', 4500, NULL, 50);
//		INSERT INTO chap10hw_emp
//					VALUES (7202, 'TEST_USER2', 'CLERK', 7201,'2016-02-21', 1800, NULL, 50);
//		INSERT INTO chap10hw_emp
//					VALUES (7203, 'TEST_USER3', 'ANALYST', 7201, '2016-04-11', 3400, NULL, 60);
//		INSERT INTO chap10hw_emp
//					VALUES (7204, 'TEST_USER4', 'SALESMAN', 7201, '2016-05-31', 2700, NULL, 60);
//		INSERT INTO chap10hw_emp
//					VALUES (7205, 'TEST_USER5', 'CLERK', 7201, '2016-07-20', 2600, NULL, 70);
//		INSERT INTO chap10hw_emp
//					VALUES (7206, 'TEST_USER6', 'CLERK', 7201, '2016-09-08', 2600, NULL, 70);
//		INSERT INTO chap10hw_emp
//					VALUES (7207, 'TEST_USER7', 'LECTURER', 7201, '2016-10-28', 2300, NULL, 80);
//		INSERT INTO chap10hw_emp
//					VALUES (7208, 'TEST_USER8', 'STUDENT', 7201, '2018-03-9', 1200, NULL, 80);	
//		UPDATE chap10hw_emp
//			SET COMM = 300
//		WHERE ENAME = 'TEST_USER4';
//
//		-- 3
//		CREATE TABLE CHAP10HW_EMP_TEMP
//			AS SELECT * FROM CHAP10HW_EMP;
//		DROP TABLE chap10hw_emp;
//		SELECT *
//			FROM CHAP10HW_EMP_TEMP;
//
//		CREATE TABLE CHAP10HW_EMP
//			AS SELECT * FROM CHAP10HW_EMP_TEMP;
//		    
//		UPDATE chap10hw_emp
//			SET DEPTNO = 70
//		WHERE SAL > (SELECT AVG(SAL)
//						FROM chap10hw_emp_TEMP
//						WHERE DEPTNO = 50);
//		SELECT *
//			FROM chap10hw_emp
//		ORDER BY DEPTNO;
//
//		-- 4
//		UPDATE chap10hw_emp
//			SET DEPTNO = 80,
//				SAL = FLOOR(SAL*1.1)
//		WHERE HIREDATE > (SELECT MIN(HIREDATE)
//							FROM chap10hw_emp_temp
//							WHERE DEPTNO = 60);
//				
//		-- 5
//		DELETE FROM chap10hw_emp
//			WHERE ENAME = ANY (SELECT ENAME
//								FROM chap10hw_emp_TEMP E, chap10hw_salgrade S
//							WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL
//		                    AND S.GRADE = 5);
//		/*           
//			WHERE SAL > (SELECT S.LOSAL
//							FROM CHAP10HW_SALGRADE
//							WHERE S.GRADE = 5)
//			AND SAL < (SELECT S.HISAL
//							FROM CHAP10HW_SALGRADE
//							WHERE S.GRADE = 5)
//		*/
//
//		-- 오토커밋 제어
//		SELECT @@AUTOCOMMIT;
//
//		SET AUTOCOMMIT =1;
//
//		SELECT * FROM CHAP10HW_DEPT;
//		INSERT INTO CHAP10HW_DEPT (DEPTNO, DNAME, LOC) VALUES ( 99, 'DML', 'BUNBUN');
//
//		ROLLBACK;
//		COMMIT;
//
//		-- ALTER 테이블 구조 변경
//		-- 열 기준 ADD. RENAME. MODIFY. DROP COLUMN. RENAME a TO b
//		-- TRUNCATE 삭제
//
//		CREATE TABLE EMP_HW (
//			EMPNO INT,
//		    ENAME VARCHAR(10),
//		    JOB VARCHAR(9),
//		    MGR INT,
//		    HIREDATE DATE,
//		    SAL DOUBLE,
//		    COMM DOUBLE,
//		    DEPTNO INT
//		    );
//		    
//		ALTER TABLE emp_HW
//			ADD BIGO VARCHAR(20);
//		ALTER TABLE emp_HW
//			MODIFY BIGO VARCHAR(30);
//		ALTER TABLE emp_HW
//			RENAME COLUMN BIGO TO REMARK;
//		INSERT INTO EMP_HW
//			SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE, E.SAL, E.COMM, E.DEPTNO, H.REMARK
//				FROM EMP E JOIN EMP_HW H;
//		SELECT *
//			FROM EMP_HW;
//		    
//
//		/* 데이터베이스 용어공부
//			차수(디그리) : 한 릴레이션 안의 속성의 개수
//		    튜플(레코드) : 행
//			카디날리티 : 튜플의 개수
//		    도메인 : 속성값들을 가진 집합체
//		    스키마 : 데이터베이스의 전반적인 정의
//		*/
	}

}
