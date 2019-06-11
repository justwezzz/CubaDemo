package com.company.cubademo.web.screens.foreignentity;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubademo.entity.ForeignEntity;

@UiController("cubademo_ForeignEntity.edit")
@UiDescriptor("foreign-entity-edit.xml")
@EditedEntityContainer("foreignEntityDc")
@LoadDataBeforeShow
public class ForeignEntityEdit extends StandardEditor<ForeignEntity> {
}