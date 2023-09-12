package exec01;

public class mysql230912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// -- 함수 upper, lower, initcap(오라클)
//		select ename, upper(ename), lower(ename)
//		from emp;
//	-- 문자열 비교하기    
//	select *
//		from emp
//	where upper(ename) = upper('scott'); -- where upper(ename) like upper('%scott%')
//
//	-- 함수 length // 한글은 length :  문자길이 , lengthb : 바이트길이 => 오라클
//	-- MYSQL => length : 바이트 길이 , character_length('') => 글자수(한글일때 주로 사용)
//	-- 한글 : 오라클은 2바이트씩 / mysql은 3바이트
//	select ename, length(ename)
//		from emp;
//	    
//	-- 직책이름이 6글자 이상인 데이터만 출력 되도록 자성
//	select *
//		from emp
//	where length(job) >= 6;
//
//	-- 함수 substr
//	select job, substr(job, 1, 2), substr(job, 3,2), substr(job, 5)
//		from emp;
//	select substr(ename,3)
//		from emp;
//
//	-- 함수 instr (찾을 문자열, 찾는 시작점, 몇번째 문자열인지)
//	select instr('hello, oracle!', 'l') as instr_1;
//	-- select instr('hello, oracle!', 'l', 5) as instr_2;(오라클)
//	-- instr('hello, oracle!', 'l',2 ,2) as instr_3(오라클)
//
//	-- 함수 replace
//	select '010-9328-9705' as replace_before,
//			replace('010-9328-9705','-', '') as replace_1; -- mysql은 매개변수 3개, 오라클은 두개부터 가능
//	        -- replace('010-9328-9705','-') as replace_1;(오라클)
//
//	-- 함수 lpad, rpad
//	select 'Oracle',
//			lpad('Oracle', 10, '#') as lpad_1,
//	        rpad('Oracle', 10, '*') as rpad_1; -- mysql은 매개변수 3개, 오라클은 두개부터 가능
//	        -- lpad('Oracle', 10) as lpad_2,
//			-- lpad('Oracle', 10) as rpad_2;
//
//	-- 함수 concat
//	select concat(ename, ename),
//			concat(ename, concat(' / 0', ename))
//	        -- pno || ename 오라클에선 가능 // mysql에선 참거짓 판별
//		from emp;
//	    
//	-- 함수 trim, ltrim, rtrim => trim ([삭제옵션][삭제할 문자] from [원본 문자열])
//	select concat('[',trim(' _ _oracle_ _ '), ']') as trim,
//			concat('[',trim(leading from ' _ _oracle_ _ '), ']') as trim_leading,
//			concat('[',concat(trim(trailing from ' _ _oracle_ _ '), ']')) as trim_trailing,
//			concat('[',concat(trim(both from ' _ _oracle_ _ '), ']')) as trim_both;
//		-- from dual; -- dual => 임시 테이블
//	select concat('[',ltrim(' _ _oracle_ _ '), ']') as trim;
//
//	-- 함수 round : 반올림 /  trunc : 버림 /  ceil : 올림 정수반환 / floor 내림 정수 반환 / mod : 나머지값
//	select round(1234.5678) as round,
//			round(1234.5678, 0) as round,
//			round(1234.5678, 1) as round,
//			round(1234.5678, 2) as round,
//			round(1234.5678, -2) as round;
//
//	select truncate(1234.5678, 1) as trunc; -- mysql은 truncate 매개변수 두개 입력해야함
//	select ceil(1234.5678) as ceil;
//	select mod(20, 3); 
//
//	-- 함수 sysdate : 날짜
//	select sysdate() as now,
//			sysdate() -1 as yesterday,
//			sysdate() +1 as tomorrow;
//
//	select sysdate(),
//			now(),
//	        date_add(sysdate(), interval 1 day) as tomorrow,
//	        date(now()),
//	        month(23030612);
//	-- date
//	-- 오라클 sysdate, add_months, months_between, next_day, last_day,
//	-- mysql
//
//	select ename, hiredate,
//		date(hiredate),
//	    adddate(date(hiredate), 2)
//		from emp;
//
//	-- 함수 형변환 
//	select cast(comm as char(5)),
//			str_to_date('20221103', '%T%m%d%H%I%S')
//		from emp;
//	    
//	-- 함수 nvl : null 감지 (오라클) ifnull(mysql)
//	select ename, comm, ifnull(comm, 'x')
//		from emp;
//	    
//	-- 함수 decode / case
//	select job,
//		if(job, 'manager', 1);
//	    
//	-- 함수 예제
//	-- 1
//	select empno,
//			rpad(rpad(empno, 2, '*'), 4,'*') as masking_empno,
//	        ename,
//			rpad(rpad(ename, 1, '*'), 5,'*') as masking_ename
//		from emp
//	where 5 <= length(ename) 
//	and length(ename) < 6;
//
//	-- 2
//	select empno, ename, sal,
//			round(sal/21.5, 1) as day_pay,
//			round(sal/21.5/8, 1) as time_pay
//		from emp;
//	   
//	-- 3
//	-- 오라클
//	select empno, ename. hiredate,
//			to_char(next_day(add_months(hiredate,3), '월요일'), 'YYYY-MM-DD') as R_JOB,
//	        nvl(to_char(comm), 'N/A') as comm
//		from emp;
//	-- mysql
//	select empno, ename, replace(date(hiredate), '-', '/') as hiredate,
//			adddate(date(hiredate), interval 3 month) as R_JOB,
//	        ifnull(comm, 'N/A') as comm
//		from emp;
//	-- 월요일로 정렬까지
//	select empno, ename, date(hiredate), dayofweek(hiredate),
//			addDate(addDate(date(hiredate), interval 3 month ), interval 7-dayofweek(addDate(date(hiredate), interval 3 month ))+2 day)
//		from emp;
//	        
//	-- 4
//	select empno, ename, mgr, 
//			case 
//				when mgr is null then '0000'
//	            when substr(mgr,1,2) = 75 then 5555
//	            when substr(mgr,1,2) = 76 then 6666
//	            when substr(mgr,1,2) = 77 then 7777
//	            when substr(mgr,1,2) = 78 then 8888
//	            else mgr
//			end as chg_mgr
//	    from emp;
//	    
//	select empno, ename, mgr,
//		if (mgr is null, '0000',
//			case substr(mgr,1,2)
//	            when 75 then 5555
//	            when 76 then 6666
//	            when 77 then 7777
//	            when 78 then 8888
//	            else mgr
//			end
//	        ) as chg_mgr
//		from emp;
//	    
//	-- 75~78이라면 두번재 수가 네번 반복되게
//	    select empno, ename, mgr,
//		if (mgr is null, '0000',
//			if (75 <= substr(mgr,1,2), rpad('', 4, substr(mgr,2,1)), mgr)
//	        ) as chg_mgr
//		from emp;
	}

}
