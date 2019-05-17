package llayout.displayers

import llayout.interfaces.StandardLContainer
import llayout.interfaces.Displayable

/**
 * An abstract Displayer that implements the StandardLContainer interface.
 * @see Displayer
 * @see StandardLContainer
 */
abstract class AbstractDisplayerContainer : ResizableDisplayer, StandardLContainer {

    override val parts: MutableCollection<Displayable> = mutableListOf()

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param width The width of this AbstractDisplayerContainer, in pixels.
     * @param height The height of this AbstractDisplayerContainer, in pixels.
     */
    constructor(x : Int, y : Int, width : Int, height : Int) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's height.
     * @param width The width of this AbstractDisplayerContainer, in pixels.
     * @param height The height of this AbstractDisplayerContainer, in pixels.
     */
    constructor(x : Int, y : Double, width : Int, height : Int) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param width The width of this AbstractDisplayerContainer, in pixels.
     * @param height The height of this AbstractDisplayerContainer, in pixels.
     */
    constructor(x : Double, y : Int, width : Int, height : Int) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's height.
     * @param width The width of this AbstractDisplayerContainer, in pixels.
     * @param height The height of this AbstractDisplayerContainer, in pixels.
     */
    constructor(x : Double, y : Double, width : Int, height : Int) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param width The width of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param height The height of this AbstractDisplayerContainer, in pixels.
     */
    constructor(x : Int, y : Int, width : Double, height : Int) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's height.
     * @param width The width of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param height The height of this AbstractDisplayerContainer, in pixels.
     */
    constructor(x : Int, y : Double, width : Double, height : Int) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param width The width of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param width The width of this AbstractDisplayerContainer, in pixels.
     * @param height The height of this AbstractDisplayerContainer, in pixels.
     */
    constructor(x : Double, y : Int, width : Double, height : Int) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's height.
     * @param width The width of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param height The height of this AbstractDisplayerContainer, in pixels.
     */
    constructor(x : Double, y : Double, width : Double, height : Int) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param width The width of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param height The height of this AbstractDisplayerContainer, as a proportion of its container's height.
     */
    constructor(x : Int, y : Int, width : Double, height : Double) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's height.
     * @param width The width of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param height The height of this AbstractDisplayerContainer, as a proportion of its container's height.
     */
    constructor(x : Int, y : Double, width : Double, height : Double) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param width The width of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param height The height of this AbstractDisplayerContainer, as a proportion of its container's height.
     */
    constructor(x : Double, y : Int, width : Double, height : Double) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's height.
     * @param width The width of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param height The height of this AbstractDisplayerContainer, as a proportion of its container's height.
     */
    constructor(x : Double, y : Double, width : Double, height : Double) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param width The width of this AbstractDisplayerContainer, in pixels.
     * @param height The height of this AbstractDisplayerContainer, as a proportion of its container's height.
     */
    constructor(x : Int, y : Int, width : Int, height : Double) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's height.
     * @param width The width of this AbstractDisplayerContainer, in pixels.
     * @param height The height of this AbstractDisplayerContainer, as a proportion of its container's height.
     */
    constructor(x : Int, y : Double, width : Int, height : Double) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, in pixels.
     * @param width The width of this AbstractDisplayerContainer, in pixels.
     * @param height The height of this AbstractDisplayerContainer, as a proportion of its container's height.
     */
    constructor(x : Double, y : Int, width : Int, height : Double) : super(x, y, width, height)

    /**
     * Constructs an AbstractDisplayerContainer with the given parameters.
     * @param x The x coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's width.
     * @param y The y coordinate of the center of this AbstractDisplayerContainer, as a proportion of its container's height.
     * @param width The width of this AbstractDisplayerContainer, in pixels.
     * @param height The height of this AbstractDisplayerContainer, as a proportion of its container's height.
     */
    constructor(x : Double, y : Double, width : Int, height : Double) : super(x, y, width, height)

}