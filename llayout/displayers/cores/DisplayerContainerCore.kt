package llayout.displayers.cores

import llayout.utilities.GraphicAction
import llayout.interfaces.CanvasCore
import llayout.interfaces.Displayable
import java.awt.Graphics

/**
 * A simple DisplayerCore Container, nothing special.
 * @see DisplayerCore
 * @see AbstractDisplayerContainerCore
 * @since LLayout 1
 */
class DisplayerContainerCore : AbstractDisplayerContainerCore, CanvasCore {

    override var graphics: MutableMap<Any?, GraphicAction> = mutableMapOf()

    constructor(width : Int, height : Int, vararg displayers: DisplayerCore) : super(width, height){
        addDisplayers(*displayers)
    }

    constructor(width : Double, height : Int, vararg displayers: DisplayerCore) : super(width, height){
        addDisplayers(*displayers)
    }

    constructor(width : Int, height : Double, vararg displayers: DisplayerCore) : super(width, height){
        addDisplayers(*displayers)
    }

    constructor(width : Double, height : Double, vararg displayers: DisplayerCore) : super(width, height){
        addDisplayers(*displayers)
    }

    constructor(width : Int, height : Int, displayers: Collection<DisplayerCore>) : super(width, height){
        addDisplayers(displayers)
    }

    constructor(width : Double, height : Int, displayers: Collection<DisplayerCore>) : super(width, height){
        addDisplayers(displayers)
    }

    constructor(width : Int, height : Double, displayers: Collection<DisplayerCore>) : super(width, height){
        addDisplayers(displayers)
    }

    constructor(width : Double, height : Double, displayers: Collection<DisplayerCore>) : super(width, height){
        addDisplayers(displayers)
    }

    constructor(vararg displayers: DisplayerCore) : super(){
        addDisplayers(*displayers)
    }

    constructor(displayers : Collection<DisplayerCore>) : super(){
        addDisplayers(displayers)
    }

    /**
     * Adds the given displayers to this DisplayerContainerCore.
     * @param displayers The added Displayers.
     * @see DisplayerCore
     * @since LLayout 1
     */
    fun addDisplayers(vararg displayers : Displayable) : DisplayerContainerCore {
        for(d : Displayable in displayers){
            super.add(d)
        }
        return this
    }

    /**
     * Adds the given displayers to this DisplayerContainerCore.
     * @param displayers The added Displayers.
     * @see DisplayerCore
     * @since LLayout 1
     */
    fun addDisplayers(displayers : Collection<Displayable>) : DisplayerContainerCore {
        for(d : Displayable in displayers){
            super.add(d)
        }
        return this
    }

    override fun loadParameters(g: Graphics) {
        for(part : Displayable in parts){
            part.drawDisplayable(g)
        }
    }

    override fun drawDisplayer(g: Graphics) {
        for(part : Displayable in parts){
            part.drawDisplayable(g)
        }
        g.clearRect(0, 0, width(), height())
        drawBackground(g)
    }

}