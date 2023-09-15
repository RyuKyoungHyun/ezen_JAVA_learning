package exec01;

public class mysql230913 {
	public static void main(String[] args) {
//		use scott;
//
//		-- 함수 sum ,, distinct 붙일시 중복된거 제외
//		select sum(distinct sal)
//			from emp;
//		    
//		-- 함수 count
//		select count(*) -- 행의 개수
//			from emp;
//
//		-- 함수 max min
//		select max(sal)
//			from emp
//		where deptno = 10;
//
//		-- emp 테이블의 모든 사원에 대해서 급여와 추가 수당의 합게를 출력하시오
//		select *
//			from emp
//		where deptno = 30;
//		select sum(sal), sum(comm)
//			from emp;
//
//		select avg(comm)
//			from emp
//		where deptno = 30;
//
//		select sum(comm)/count(*)
//			from emp
//		where deptno = 30;
//
//		-- groud by 정렬
//		select deptno, job, avg(sal)
//			from emp
//		group by deptno, job
//		order by deptno, job;
//
//		select * 
//			from emp
//		order by deptno;
//		-- group by 절을 이용하여, 부서 번호별 평균 추가수당을 출력
//		select deptno, avg(if(comm is null, 0 , comm))
//			from emp
//		group by deptno
//		order by deptno;
//
//		-- group by -> having (if와 비슷) 그룹화된 결과를 기준으로 제한
//
//		-- having 절을 사용하여 emp 테이블의 부서별 직책의 평균 급여가 500이상인 사원들의 부서번호, 직책, 부서별 직책의 평균급여가 출력
//		select deptno, job, avg(sal)
//			from emp
//		group by deptno, job
//			having  avg(sal) >= 500
//		order by deptno, job;
//
//		-- rollup
//		select deptno, job, count(*), max(sal), sum(sal), avg(sal), grouping(deptno), grouping(job)
//			from emp
//		group by deptno, job with rollup;
//
//		-- grouping
//		-- select deptno, job , count(*)
//		-- 	from emp
//		-- group by grouping sets(deptno, job)
//		-- order by deptno, job;
//
//		-- 예제 1
//
//		-- oracle
//		select deptno, trunc(avg(sal)), max(sal), min(sal), count(*)
//			from emp
//		group by deptno
//		order by deptno desc;
//		-- mysql
//		select deptno, floor(avg(sal)), max(sal), min(sal), count(*)
//			from emp
//		group by deptno
//		order by deptno desc;
//
//		-- 2
//		select job, count(*)
//			from emp
//		group by job
//			having count(*) >= 3;
//		    
//		-- 3
//		select year(hiredate), deptno, count(*)
//			from emp
//		group by year(hiredate), deptno
//		order by year(hiredate) desc ,deptno;
//
//		select *
//			from emp;
//		    
//		-- 4
//		select if(comm is null, 'X', 'O'), count(*)
//			from emp
//		group by if(comm is null, 'X', 'O');
//
//		-- 5 
//		select deptno, year(hiredate), count(*), max(sal), sum(sal), avg(sal)
//			from emp
//		group by deptno, year(hiredate) with rollup;
//
//		-- join
//		select e.empno, e.ename, e.deptno, d.dname, d.loc
//			from emp e, dept d 
//		where  e.deptno = d.deptno;
//
//		-- emp 테이블 별칭을 e, dept ㅌ이블 별칭을 d로 해서 emp 테이블의 사원번호와 dept 테이블의 부서 이르이 출력되록 출력
//		select e.empno, d.dname
//			from emp e, dept d
//		where e.deptno = d.deptno;
//
//		-- emp e. dept d 등가 조인을 작성 / 급여 2500 이하 사원번호 9999이하인 사원정보 출력, 부서정보 출력
//		select e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc
//			from emp e, dept d
//		where e.deptno = d.deptno
//		and sal <= 2500
//		and e.empno <= 9999
//		order by e.empno;
	}
}
