package exec01;

public class mysql230911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		mysqul 수업
		
		
//		use scott;
//
//		select distinct deptno
//		from emp;
//
//		-- 직책(job)과 부서번호(deptno)가 모두 중복된 데이터를 제외 하고 보여주기
//		select distinct job,deptno
//		from emp;
//
//		-- 별칭 붙이기
//		select distinct job as "직책",
//				deptno as "부서번호"
//		from emp;
//
//		-- 정렬 오름차순(asc) // 내림차순(desc)
//		select *
//			from emp
//		order by sal;
//
//		-- emp테이블의 전체 열을 부서번호(오름차순), 급여(내림차순)으로 정렬
//		select *
//			from emp
//		order by deptno, sal desc;
//
//		-- 92p 예제
//		select distinct job
//			from emp;
//		select	empno as employee_no,
//				ename as employee_name,
//		        job,
//		        mgr as manager,
//		        hiredate,
//		        sal as salary,
//		        comm as commission,
//		        deptno as department_no
//			from emp
//		order by deptno desc, ename;
//
//		-- where : 필요한 데이터만 출력 (행) 
//		select *
//			from emp
//		where empno = 7782;
//
//		-- and 연산자 => 문자열일 경우 ''(작은따옴표)를 붙이기
//		select *
//			from emp
//		where deptno = 30
//			and job = 'salesman';
//		    
//		-- or 연산자
//		select *
//			from emp
//		where deptno = 30
//			or job = 'clerk';
//		    
//		 -- 사원번호가 7499이고, 부서번호가 30인 사원정보 출력
//		select *
//			from emp
//		where empno = 7499
//			and deptno = 30;
//		 -- 부서번호가 30이거나 직업의 값이 clerk인 사원종보 출력
//		 select *
//			from emp
//		where deptno = 30
//			or job = 'clerk';
//		    
//		 -- 비교 연산자 >=, =, <= // 다를경우 true !=, <>, ^=
//		 select *
//			from emp
//		where ename <= 'f';
//		 -- 논리 부정 연산자 not
//		 
//		 -- in 연산자 
//		 select *
//			from emp
//		where /*not 붙일시 반대 경우 */ job in ('manager', 'salesman', 'clerk');
//
//		-- between A and B : A와 B사이의 값
//		select *
//			from emp
//		where not sal between 2000 and 3000;
//
//		-- like 연산자 // _ : 하나의 문자 데이터(자릿수를 나타내기도 함) , % : 길이와 상관없이 모든 문자 데이터
//		select *
//			from emp
//		where ename like 's%';
//		-- 사원 이름에 am이 포함되어 있는 사원전체 정보 출력
//		select *
//			from emp
//		where ename like '%am%';
//
//		-- is null 연산자
//		select *
//			from emp
//		where comm is null;
//
//		-- 집합연산자 union , union all, minus(leftjoin), intersect(innerjoin)
//		select empno, ename, sal, deptno /* 자리의 수와 각 자리의 데이터의 타입이 동일 해야함*/
//			from emp
//		where deptno = 10
//		union
//		select empno, ename, sal, deptno
//			from emp
//		where deptno = 20;
//
//		-- 125p 예제
//		select *
//			from emp
//		where ename like '%s';
//
//		select empno, ename, job, sal, deptno
//			from emp
//		where deptno = 30 
//		and job like 'salesman';
//
//		select empno, ename, job, sal, deptno
//			from emp
//		where deptno != 10/* deptno in (20,30)*/
//		and sal > 2000; -- 집합연산자 안 씀
//		select empno, ename, job, sal, deptno
//			from emp
//		where deptno = 30
//		and sal > 2000
//		union
//		select empno, ename, job, sal, deptno
//			from emp
//		where deptno = 20
//		and sal > 2000; -- 집합 연산자 씀
//
//		select *
//			from emp
//		where comm is null
//		and mgr is not null 
//		and (job = 'clerk'
//		or job = 'manager') /*job in ('manager', 'clerk')*/
//		and not ename like '_L%';
	}

}
