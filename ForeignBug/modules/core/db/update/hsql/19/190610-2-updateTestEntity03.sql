-- update CUBADEMO_TEST_ENTITY set A_ID = <default_value> where A_ID is null ;
alter table CUBADEMO_TEST_ENTITY alter column A_ID set not null ;
