-- begin CUBADEMO_TEST_ENTITY
create table CUBADEMO_TEST_ENTITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    A_ID varchar(36) not null,
    B varchar(255),
    --
    primary key (ID)
)^
-- end CUBADEMO_TEST_ENTITY
-- begin CUBADEMO_FOREIGN_ENTITY
create table CUBADEMO_FOREIGN_ENTITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    F varchar(255),
    --
    primary key (ID)
)^
-- end CUBADEMO_FOREIGN_ENTITY
