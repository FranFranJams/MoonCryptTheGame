package entity;

import controller.Controller;
import core.Motion;
import gfx.AnimationManager;
import gfx.SpriteLibrary;

import java.awt.*;

public abstract class MovingEntity extends GameObject {

    private Controller controller;
    private Motion motion;
    private AnimationManager animationManager;

    public MovingEntity(Controller controller, SpriteLibrary spriteLibrary) {
        super();
        this.controller = controller;
        this.motion = new Motion(2);
        animationManager = new AnimationManager(spriteLibrary.getUnit("dave"));
    }

    @Override
    public void update() {
        motion.update(controller);
        position.apply(motion);
        animationManager.update();
    }

    @Override
    public Image getSprite() {
        return animationManager.getSprite();
    }
}
