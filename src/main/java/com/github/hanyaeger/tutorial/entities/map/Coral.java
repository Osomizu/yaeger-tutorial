package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.engine.Size;
import com.github.hanyaeger.api.engine.entities.entity.Coordinate2D;
import com.github.hanyaeger.api.engine.entities.entity.collisions.AABBCollider;
import com.github.hanyaeger.api.engine.entities.entity.sprite.SpriteEntity;

public class Coral extends SpriteEntity implements AABBCollider {

    protected Coral(String resource, Coordinate2D location, Size size) {
        super(resource, location, size);
    }
}