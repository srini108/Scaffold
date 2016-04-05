
create table project (
	project_id     NUMBER(11) PRIMARY KEY,
	project_name   VARCHAR2(400) NOT NULL 
);


create table project_contract (
	project_contract_id  NUMBER(11) PRIMARY KEY,
	project_id	     NUMBER(11) REFERENCES project(project_id),
	code	     	     VARCHAR2(32) NOT NULL,
	description	     VARCHAR2(4000),
	budget		     NUMBER(13,2) NOT NULL,
	cost		     NUMBER(13,2) NOT NULL,
	forecast	     NUMBER(13,2),
	paid		     NUMBER(13,2),
	complete_percentage  NUMBER(11,2),
	vendor		     VARCHAR2(200) NOT NULL
);


delete from project_contract;
delete from project;

insert into project values (1,'California Highway expansion');
insert into project values (2,'Bridge construction');



insert into project_contract  values (1, 1, 'C0001', 'Phase 1', 1000000, 900000,500000, 100000, 25, 'ABC Ltd');

insert into project_contract  values (2, 1, 'C0002', 'Phase 2', 2000000, 1900000,1500000, 2000000, 0, 'ABC Ltd');

insert into project_contract  values (3, 1, 'C0003', 'Phase 3', 3000000, 2900000,2500000, 3000000, 0, 'ABC Ltd');

insert into project_contract  values (4, 2, 'C0004', 'Phase 1', 5000000, 4000000,1500000, 1000000, 15, 'XYZ Ltd');

commit;