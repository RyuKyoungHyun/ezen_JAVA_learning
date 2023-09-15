package exec01;

public class mysql230914 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		use scott;
//
//		-- join
//		select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, d.deptno, d.dname, d.loc
//			from emp e join dept d on e.deptno = d.deptno
//		    where sal >= 3000
//		    and e.mgr is not null
//		order by deptno, e.empno;
//
//		-- 예제 1
//		select e.deptno, d.dname, e.empno, e.ename, e.sal
//			from dept d join emp e on e.deptno = d.deptno
//		where e.sal >2000
//		order by e.deptno, d.dname;
//
//		-- 예제 2
//		select e.deptno, d.dname, floor(avg(e.sal)), max(e.sal), min(e.sal), count(*)
//			from emp e join dept d on e.deptno = d.deptno
//		group by e.deptno, d.dname;
//
//		-- 3
//		select d.deptno, d.dname , e.empno, e.ename, e.job, e.sal
//			from dept d left outer join emp e on e.deptno = d.deptno
//		order by d.deptno, e.ename;
//
//		-- 4
//		select d.deptno, d.dname, e.empno, e.ename, e.mgr, e.sal, e.deptno, s.losal, s.hisal, s.grade, m.empno, m.ename
//			from emp e right join dept d on d.deptno = e.deptno
//					   left join salgrade s on s.losal <= e.sal and e.sal <= s.hisal -- e.sal between s.losal and s.hisal
//		               left join emp m on e.mgr = m.empno
//		order by d.deptno;
//
//		-- 서브쿼리 : 괄호르 묶어서 사용, order by 절 사용불가, 서브쿼리 결과 행 수는 무조건 하나
//		select *
//			from emp
//		where comm > (select comm
//						from emp
//						where ename = 'ALLEN');
//
//
//		-- emp 테이블에서 전체 사원의 평균 급여보다 작거나 같은 급여를 받고 있는 20번 부서의 사원 및 부서 정보 출력
//		select *
//			from emp e, dept d
//		where e.deptno = d.deptno
//		and sal <= (select avg(sal)
//						from emp)
//		and e.deptno = 20;
//
//		-- emp 테이블에서 20번 부서 사원들의 평균 급여보다 작거나 같은 급여를 받고 있는 사원 및 부서정보 출력
//		select *
//			from emp e, dept d
//		where e.deptno = d.deptno
//		and sal <= (select avg(sal)
//						from emp
//						where deptno = 20)
//		order by sal;
//
//		-- emp 테이블 사원 중에 10번 부서에 속한 모든 사원들보다 일찍 입사한 사원 정보 구하는 sql 작성
//		select *
//			from emp
//		where hiredate < all (select hiredate
//									from emp
//									where deptno = 10);
//		                            
//		select *
//			from emp
//		order by hiredate;
//
//		-- 서브쿼리 예제
//		select e.job, e.empno, e.ename, e.sal, e.deptno, d.dname
//			from emp e, dept d
//		where e.deptno = d.deptno
//		and e.job = (select job
//						from emp
//		                where ename = 'ALLEN')
//		order by e.sal desc;
//
//		-- 2
//		select e.empno, e.ename, d.dname, date(e.hiredate), d.loc, e.sal, s.grade
//			from emp e, dept d, salgrade s
//		where e.deptno = d.deptno
//		and e.sal between s.losal and s.hisal
//		and sal > (select avg(sal)
//					from emp)
//		order by e.sal desc, e.empno;
//
//		-- 3
//		select e.empno, e.ename, e.job, e.deptno, d.dname, d.loc
//			from (select *
//					from emp
//					where deptno = 10)  e,
//		    dept d
//		where e.deptno = d.deptno
//		and not e.job = any (select job
//							from emp
//							where deptno = 30);
//
//		-- 4
//		select e.empno, e.ename, e.sal, s.grade
//			from emp e, salgrade s
//		where e.sal between s.losal and s.hisal
//		and sal > all (select sal
//							from emp
//						where job = 'SALESMAN');
//		                
	}

}
