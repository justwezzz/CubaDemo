package com.company.cubademo.web.screens.testentity;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubademo.entity.TestEntity;

@UiController("cubademo_TestEntity.edit")
@UiDescriptor("test-entity-edit.xml")
@EditedEntityContainer("testEntityDc")
@LoadDataBeforeShow
public class TestEntityEdit extends StandardEditor<TestEntity> {
}