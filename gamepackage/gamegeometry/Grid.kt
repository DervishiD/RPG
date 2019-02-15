package gamepackage.gamegeometry

import geometry.Point
import geometry.Vector
import main.FRAMEX
import main.FRAMEY

/**
 * The class that represents a game grid
 */
class Grid {

    companion object {
        private const val DEFAULT_MESH : Int = 120 //TODO
    }

    /**
     * The number of lines
     */
    var lines : Int
    /**
     * The number of columns
     */
    var columns : Int
    /**
     * The mesh size
     */
    private var mesh : Int = DEFAULT_MESH

    /**
     * The origin of the Grid
     */
    private var origin : Point = Point(0, 0)

    /**
     * The actual grid, a 2D array
     */
    private var grid : ArrayList<ArrayList<Cell>> = ArrayList(1)

    constructor(lines : Int, columns : Int){
        this.lines = lines
        this.columns = columns
        resetOrigin()

        grid = ArrayList(lines)
        for(i : Int in 0 until lines){
            grid.add(ArrayList(columns))
            for(j : Int in 0 until columns){
                grid[i].add(Cell())
            }
        }

    }

    /**
     * The origin of the grid
     */
    fun origin() : Point = origin

    /**
     * Returns a given line
     */
    fun line(index : Int) : ArrayList<Cell>{
        if(index < lines){
            return grid[index]
        }else throw IndexOutOfBoundsException("There is no line with index $index in this Grid")
    }

    /**
     * Returns a given column
     */
    fun column(index : Int) : ArrayList<Cell>{
        if(index < columns){
            val result : ArrayList<Cell> = ArrayList()
            for(line : ArrayList<Cell> in grid){
                result.add(line[index])
            }
            return result
        }else throw IndexOutOfBoundsException("There is no column with index $index in this Grid")
    }

    fun cellAt(line : Int, column : Int) : Cell{
        if(line < lines && column < columns && line >= 0 && column >= 0){
            return grid[line][column]
        }else throw IndexOutOfBoundsException("The cell you're looking for at ($line, $column) doesn't exist")
    }

    /**
     * Resets the position of the origin
     */
    private fun resetOrigin(){
        origin setx (FRAMEX / 2) - (columns / 2) * mesh
        origin sety (FRAMEY / 2) - (lines / 2) * mesh
    }

    /**
     * Moves the origin along the given vector
     */
    infix fun moveAlong(v : Vector){
        origin += v
    }

}