package frc.robot.simulator.sim.field.wheeldisplacement;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.Shape;
import com.badlogic.gdx.physics.box2d.World;

import java.util.ArrayList;
import java.util.List;

/**
 * A physics body  of the field, based on the 2d image
 * TODO: Move this image to meters stuff into a separate class, it doesn't belong in a Physics Body
 */
public class Field {
    public static final float INCHES_TO_METERS = 0.0254f;

    public static final Vector2 imageSize = new Vector2(540/2, 1134/2);
    public static final Vector2 topLeft = new Vector2(25/2, 96/2);
    public static final Vector2 bottomRight = new Vector2(514/2, 1040/2);

    // feet per pixel is width in feet divided by width of inner field pixels
    public static final float ftPerPixelWidth = 26.9375f / (bottomRight.x - topLeft.x);
    public static final float inchesPerPixelWidth = ftPerPixelWidth * 12;
    public static final float metersPerPixelWidth = inchesPerPixelWidth * INCHES_TO_METERS;
    public static final float ftPerPixelHeight = 52.4375f / (bottomRight.y - topLeft.y);
    public static final float inchesPerPixelHeight = ftPerPixelHeight * 12;
    public static final float metersPerPixelHeight = inchesPerPixelHeight * INCHES_TO_METERS;

    // set the size of the field, in meters, to the size of the image, based on what
    // we know of the inner size in feet. yikes
    public static final float width = inchesPerPixelWidth * imageSize.x * INCHES_TO_METERS;
    public static final float height = inchesPerPixelHeight * imageSize.y * INCHES_TO_METERS;

}
