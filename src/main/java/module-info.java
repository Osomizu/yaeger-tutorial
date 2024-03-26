module waterworld {
    requires hanyaeger;

    exports com.github.hanyaeger.tutorial;
    exports com.github.hanyaeger.tutorial.scenes;

    opens audio;
    opens backgrounds;
    opens sprites;
}
