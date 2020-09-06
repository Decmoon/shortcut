package com.decmoon.shortcut.i18n;

import com.decmoon.shortcut.exception.i18n.I18NException;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * 国际化相关
 *
 * @author decmoon
 */
public class ResourceBundleGetter {
    private ResourceBundleGetter() {
    }

    public static ResourceBundle getResourceBundle(String path) {
        return getResourceBundle(path, Locale.getDefault());
    }

    public static ResourceBundle getResourceBundle(String path, Locale localel) {
        try {
            return ResourceBundle.getBundle(path, localel);
        } catch (MissingResourceException e) {
            throw new I18NException();
        }
    }
}
