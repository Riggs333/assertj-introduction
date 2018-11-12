package de.codecentric;

import static de.codecentric.Location.ASGARD;
import static de.codecentric.Location.EARTH;
import static de.codecentric.Location.TITAN;

class MarvelCharacterTestData {

    MarvelCharacter capAmerica = new MarvelCharacter("Captain America", "Steve", EARTH);

    MarvelCharacter ironMan = new MarvelCharacter("Iron Man", "Tony", EARTH);

    MarvelCharacter hulk = new MarvelCharacter("Hulk", "Bruce", EARTH);

    MarvelCharacter thor = new MarvelCharacter("Thor", "Thor", ASGARD);

    MarvelCharacter loki = new MarvelCharacter("Loki", "Loki", ASGARD);

    MarvelCharacter thanos = new MarvelCharacter("Thanos", "Thanos", TITAN);

}
