package com.ezetap.network.constants;

import static com.ezetap.network.constants.UIType.BUTTON;
import static com.ezetap.network.constants.UIType.EDITTEXT;
import static com.ezetap.network.constants.UIType.IMAGEVIEW;
import static com.ezetap.network.constants.UIType.LABEL;
import static com.ezetap.network.constants.UIType.LABEL_VALUE;

import androidx.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@StringDef({LABEL, LABEL_VALUE, EDITTEXT, IMAGEVIEW, BUTTON})
public @interface UIType {
    String LABEL = "label";
    String LABEL_VALUE = "label_value";
    String EDITTEXT = "edittext";
    String IMAGEVIEW = "imageview";
    String BUTTON = "button";
}
