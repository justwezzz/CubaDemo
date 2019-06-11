package com.company.cubademo.web.screens.foreignentity;

import com.haulmont.cuba.gui.screen.*;
import com.company.cubademo.entity.ForeignEntity;

@UiController("cubademo_ForeignEntity.browse")
@UiDescriptor("foreign-entity-browse.xml")
@LookupComponent("foreignEntitiesTable")
@LoadDataBeforeShow
public class ForeignEntityBrowse extends StandardLookup<ForeignEntity> {
}