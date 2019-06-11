package com.company.cubademo.web.screens.testentity;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubademo.entity.TestEntity;

@UiController("cubademo_TestEntity.browse")
@UiDescriptor("test-entity-browse.xml")
@LookupComponent("testEntitiesTable")
@LoadDataBeforeShow
public class TestEntityBrowse extends StandardLookup<TestEntity> {
}