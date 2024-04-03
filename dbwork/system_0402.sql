--계정 생성(system에서만 가능): 실행은 ctrl+enter 단축키!
create user angel identified by a1324;--오류발생
--최신 버전에서는 앞에 공통문자 c##을 붙여서 계정 생성을 해야만 한다.
create user c##angel identified by a1234;
--system 계정에 생성된 계정 확인하기
select username from dba_users;
--c##angel 계정 삭제하기
drop user c##angel;
--c## 공통문자를 안붙이고 계정 생성을 하려면 세션변경을 해야만 한다.
alter session set "_ORACLE_SCRIPT"=true;
create user angel identified by a1234;
select username from dba_users;
drop user angel;
select username from dba_users;
create user angel identified by a1234;
grant connect,resource to angel;
--scott/tiger계정에 비번으로 user를 생성후 기본권한 추가하기
create user scott identified by tiger;
select username from dba_users;
grant connect,resource to scott;
select * from tab;
select * from emp;
commit;
