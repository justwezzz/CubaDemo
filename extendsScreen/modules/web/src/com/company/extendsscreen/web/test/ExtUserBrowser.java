package com.company.extendsscreen.web.test;

import com.haulmont.cuba.gui.app.security.user.browse.UserBrowser;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

@UiController("test_User.browse")
@UiDescriptor("ext-user-browse.xml")
public class ExtUserBrowser extends UserBrowser {
}