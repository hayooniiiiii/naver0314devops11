--���� ����(system������ ����): ������ ctrl+enter ����Ű!
create user angel identified by a1324;--�����߻�
--�ֽ� ���������� �տ� ���빮�� c##�� �ٿ��� ���� ������ �ؾ߸� �Ѵ�.
create user c##angel identified by a1234;
--system ������ ������ ���� Ȯ���ϱ�
select username from dba_users;
--c##angel ���� �����ϱ�
drop user c##angel;
--c## ���빮�ڸ� �Ⱥ��̰� ���� ������ �Ϸ��� ���Ǻ����� �ؾ߸� �Ѵ�.
alter session set "_ORACLE_SCRIPT"=true;
create user angel identified by a1234;
select username from dba_users;
drop user angel;
select username from dba_users;