alter table CUBADEMO_TEST_ENTITY add constraint FK_CUBADEMO_TEST_ENTITY_ON_A foreign key (A_ID) references CUBADEMO_FOREIGN_ENTITY(ID);
create index IDX_CUBADEMO_TEST_ENTITY_ON_A on CUBADEMO_TEST_ENTITY (A_ID);