package llayout.interfaces

import llayout.Action
import llayout.utilities.LObservable

/**
 * An interface implemented by discrete selector classes that let the user select something.
 * The type parameter T is the type of the selected objects.
 */
interface AbstractSelector<T> {

    /**
     * The index of the current option.
     * @see options
     */
    var currentOptionIndex : LObservable<Int>

    /**
     * The list of options that the selector chooses from.
     */
    val options : MutableList<T>

    /**
     * Returns the current selected option
     */
    fun selectedOption() : T = options[currentOptionIndex.value]

    fun addSelectionListener(key : Any, action : Action) :AbstractSelector<T>{
        currentOptionIndex.addListener(key, action)
        return this
    }

    fun addSelectionListener(action : Action) : AbstractSelector<T>{
        currentOptionIndex.addListener(action)
        return this
    }

    /**
     * Returns the number of options that this Selector can select.
     * @see options
     */
    fun optionsNumber() : Int = options.size

    /**
     * Adds an option to the list.
     * @see options
     */
    fun addOption(option : T) : AbstractSelector<T> {
        options.add(option)
        return this
    }

    /**
     * Adds a Collection of options to the list.
     * @see options
     */
    fun addOptionsList(options : Collection<T>) : AbstractSelector<T> {
        for(option : T in options){
            addOption(option)
        }
        return this
    }

    /**
     * Adds a vararg Collection of options to the list.
     * @see options
     */
    fun addOptionsList(vararg options : T) : AbstractSelector<T> {
        for(option : T in options){
            addOption(option)
        }
        return this
    }

}