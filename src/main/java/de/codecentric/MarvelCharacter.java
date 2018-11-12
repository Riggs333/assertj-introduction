package de.codecentric;

import java.util.StringJoiner;

final class MarvelCharacter {

    private final String name;

    private final String realName;

    private final Location home;

    MarvelCharacter(String name, String realName, Location home) {
        this.name = name;
        this.realName = realName;
        this.home = home;
    }

    public String getRealName() {
        return realName;
    }

    public Location getHome() {
        return home;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MarvelCharacter.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("realName='" + realName + "'")
                .add("home=" + home)
                .toString();
    }
}
