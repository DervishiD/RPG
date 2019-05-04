package llayout

import java.awt.Color
import java.awt.Font
import java.awt.Graphics

//TYPEALIAS------------------------------------------------------------------

typealias Action = () -> Unit
typealias GraphicAction = (Graphics, Int, Int) -> Unit
typealias MouseWheelAction = (Int) -> Unit
typealias RealFunction = (Double) -> Double

//FONTS-----------------------------------------------------------------------

/**
 * The default font used in the display system.
 * @see Font
 */
internal val DEFAULT_SMALL_FONT : Font = Font("Monospaced", Font.BOLD, 16)
/**
 * The default font used in the questions asked to the User.
 * @see Font
 */
internal val DEFAULT_MEDIUM_FONT : Font = Font("Monospaced", Font.BOLD, 24)

/**
 * The default font used in title-type displays.
 * @see Font
 */
internal val DEFAULT_LARGE_FONT : Font = Font("Monospaced", Font.BOLD, 32)

//COLOURS----------------------------------------------------------------------

/**
 * The default color used in the display system.
 * @see Color
 */
internal val DEFAULT_COLOR : Color = Color.BLACK

//NUMBERS----------------------------------------------------------------------

const val DOUBLE_PRECISION : Double = 1e-3
