package com.rahulverlekar.fonticon.IconMoon;

import com.joanzapata.iconify.Icon;

/**
 * Created by abhik on 22-11-2016.
 */

public enum IconMoonIcons implements Icon {
    iconmoon_bidchat('\ue918');

    IconMoonIcons(char character) {
        this.character = character;
    }

    char character;

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
