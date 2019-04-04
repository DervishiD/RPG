package img.programimages

import java.awt.RenderingHints
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

private val SEPARATOR : String by lazy{
    if(System.getProperty("os.name").toLowerCase().contains("win")) "\\" else "/"
}

private val IMAGES_FOLDER : String = "src${SEPARATOR}img${SEPARATOR}images"

private val RED101_PATH : String = "$IMAGES_FOLDER${SEPARATOR}red101.png"

val RED101 : BufferedImage by lazy{loadImage(RED101_PATH)}

private fun loadImage(path : String) : BufferedImage = ImageIO.read(File(path))

/**
 * Resize a square image to a given size
 */
fun resizeGridImage(originalImage : BufferedImage, size : Int) : BufferedImage{
    return if(size == originalImage.height){
        originalImage
    }else{
        val resized = BufferedImage(size, size, originalImage.type)
        val gr = resized.createGraphics()
        gr.setRenderingHint(
            RenderingHints.KEY_INTERPOLATION,
            RenderingHints.VALUE_INTERPOLATION_BILINEAR
        )
        gr.drawImage(
            originalImage, 0, 0, size, size, 0, 0, originalImage.width,
            originalImage.height, null
        )
        gr.dispose()
        resized
    }
}

/**
 * Resize a square image to a given size
 */
fun resizeGridImage(size : Int, originalImage : BufferedImage) : BufferedImage = resizeGridImage(originalImage, size)

