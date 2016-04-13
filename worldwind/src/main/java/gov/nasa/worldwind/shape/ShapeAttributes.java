/*
 * Copyright (c) 2016 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration. All Rights Reserved.
 */

package gov.nasa.worldwind.shape;

import gov.nasa.worldwind.render.Color;

public class ShapeAttributes {

    protected boolean drawInterior;

    protected boolean drawOutline;

    protected boolean enableLighting;

    protected Color interiorColor;

    protected Color outlineColor;

    protected float outlineWidth;

    protected int outlineStippleFactor;

    protected short outlineStipplePattern;

    protected Object imageSource;

    protected boolean depthTest;

    protected boolean drawVerticals;

    protected boolean applyLighting;

    public ShapeAttributes() {
        this.drawInterior = true;
        this.drawOutline = true;
        this.enableLighting = false;
        this.interiorColor = Color.WHITE;
        this.outlineColor = Color.RED;
        this.outlineWidth = 1.0f;
        this.outlineStippleFactor = 0;
        this.outlineStipplePattern = (short) 0xF0F0;
        this.imageSource = null;
        this.depthTest = true;
        this.drawVerticals = false;
        this.applyLighting = false;
    }

    public ShapeAttributes(final ShapeAttributes copy) {
        this.drawInterior = copy.drawInterior;
        this.drawOutline = copy.drawOutline;
        this.enableLighting = copy.enableLighting;
        this.interiorColor = new Color(interiorColor);
        this.outlineColor = new Color(outlineColor);
        this.outlineWidth = copy.outlineWidth;
        this.outlineStippleFactor = copy.outlineStippleFactor;
        this.outlineStipplePattern = copy.outlineStipplePattern;
        this.imageSource = copy.imageSource;
        this.depthTest = copy.depthTest;
        this.drawVerticals = copy.drawVerticals;
        this.applyLighting = copy.applyLighting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeAttributes that = (ShapeAttributes) o;

        if (drawInterior != that.drawInterior) return false;
        if (drawOutline != that.drawOutline) return false;
        if (enableLighting != that.enableLighting) return false;
        if (Double.compare(that.outlineWidth, outlineWidth) != 0) return false;
        if (outlineStippleFactor != that.outlineStippleFactor) return false;
        if (outlineStipplePattern != that.outlineStipplePattern) return false;
        if (depthTest != that.depthTest) return false;
        if (drawVerticals != that.drawVerticals) return false;
        if (applyLighting != that.applyLighting) return false;
        if (interiorColor != null ? !interiorColor.equals(that.interiorColor) : that.interiorColor != null)
            return false;
        if (outlineColor != null ? !outlineColor.equals(that.outlineColor) : that.outlineColor != null) return false;
        return !(imageSource != null ? !imageSource.equals(that.imageSource) : that.imageSource != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (drawInterior ? 1 : 0);
        result = 31 * result + (drawOutline ? 1 : 0);
        result = 31 * result + (enableLighting ? 1 : 0);
        result = 31 * result + (interiorColor != null ? interiorColor.hashCode() : 0);
        result = 31 * result + (outlineColor != null ? outlineColor.hashCode() : 0);
        temp = Double.doubleToLongBits(outlineWidth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + outlineStippleFactor;
        result = 31 * result + (int) outlineStipplePattern;
        result = 31 * result + (imageSource != null ? imageSource.hashCode() : 0);
        result = 31 * result + (depthTest ? 1 : 0);
        result = 31 * result + (drawVerticals ? 1 : 0);
        result = 31 * result + (applyLighting ? 1 : 0);
        return result;
    }

    /**
     * Indicates whether the interior of the associated shape is drawn.
     */
    public boolean isDrawInterior() {
        return drawInterior;
    }

    /**
     * Indicates whether the interior of the associated shape is drawn.
     */
    public ShapeAttributes setDrawInterior(boolean drawInterior) {
        this.drawInterior = drawInterior;
        return this;
    }

    /**
     * Indicates whether the outline of the associated shape is drawn
     */
    public boolean isDrawOutline() {
        return drawOutline;
    }

    /**
     * Indicates whether the outline of the associated shape is drawn
     */
    public ShapeAttributes setDrawOutline(boolean drawOutline) {
        this.drawOutline = drawOutline;
        return this;
    }

    /**
     * Indicates whether lighting is applied to the associated shape.
     */
    public boolean isEnableLighting() {
        return enableLighting;
    }

    /**
     * Indicates whether lighting is applied to the associated shape.
     */
    public ShapeAttributes setEnableLighting(boolean enableLighting) {
        this.enableLighting = enableLighting;
        return this;
    }

    /**
     * Indicates the associated shape's interior color and opacity.
     */
    public Color getInteriorColor() {
        return interiorColor;
    }

    /**
     * Indicates the associated shape's interior color and opacity.
     */
    public ShapeAttributes setInteriorColor(Color interiorColor) {
        this.interiorColor = interiorColor;
        return this;
    }

    /**
     * Indicates the associated shape's outline color and opacity.
     */
    public Color getOutlineColor() {
        return outlineColor;
    }

    /**
     * Indicates the associated shape's outline color and opacity.
     */

    public ShapeAttributes setOutlineColor(Color outlineColor) {
        this.outlineColor = outlineColor;
        return this;
    }

    /**
     * Indicates the associated shape's outline color and opacity.
     */
    public float getOutlineWidth() {
        return outlineWidth;
    }

    /**
     * Indicates the associated shape's outline color and opacity.
     */

    public ShapeAttributes setOutlineWidth(float outlineWidth) {
        this.outlineWidth = outlineWidth;
        return this;
    }

    /**
     * Indicates the associated shape's outline stipple factor. Specifies the number of times each bit in the outline
     * stipple pattern is repeated before the next bit is used. For example, if the outline stipple factor is 3, each
     * bit is repeated three times before using the next bit. The specified factor must be either 0 or an integer
     * greater than 0. A stipple factor of 0 indicates no stippling.
     */
    public int getOutlineStippleFactor() {
        return outlineStippleFactor;
    }

    /**
     * Indicates the associated shape's outline stipple factor. Specifies the number of times each bit in the outline
     * stipple pattern is repeated before the next bit is used. For example, if the outline stipple factor is 3, each
     * bit is repeated three times before using the next bit. The specified factor must be either 0 or an integer
     * greater than 0. A stipple factor of 0 indicates no stippling.
     */
    public ShapeAttributes setOutlineStippleFactor(int outlineStippleFactor) {
        this.outlineStippleFactor = outlineStippleFactor;
        return this;
    }

    /**
     * Indicates the associated shape's outline stipple pattern. Specifies a number whose lower 16 bits define a pattern
     * of which pixels in the outline are rendered and which are suppressed. Each bit corresponds to a pixel in the
     * shape's outline, and the pattern repeats after every n*16 pixels, where n is the [stipple factor]{@link
     * ShapeAttributes#outlineStippleFactor}. For example, if the outline stipple factor is 3, each bit in the stipple
     * pattern is repeated three times before using the next bit.
     * <p/>
     * To disable outline stippling, either specify a stipple factor of 0 or specify a stipple pattern of all 1 bits,
     * i.e., 0xFFFF.
     *
     * @default 0xF0F0
     */
    public short getOutlineStipplePattern() {
        return outlineStipplePattern;
    }

    /**
     * Indicates the associated shape's outline stipple pattern. Specifies a number whose lower 16 bits define a pattern
     * of which pixels in the outline are rendered and which are suppressed. Each bit corresponds to a pixel in the
     * shape's outline, and the pattern repeats after every n*16 pixels, where n is the [stipple factor]{@link
     * ShapeAttributes#outlineStippleFactor}. For example, if the outline stipple factor is 3, each bit in the stipple
     * pattern is repeated three times before using the next bit.
     * <p/>
     * To disable outline stippling, either specify a stipple factor of 0 or specify a stipple pattern of all 1 bits,
     * i.e., 0xFFFF.
     *
     * @default 0xF0F0
     */
    public ShapeAttributes setOutlineStipplePattern(short outlineStipplePattern) {
        this.outlineStipplePattern = outlineStipplePattern;
        return this;
    }

    /**
     * Indicates the associated shape's image source. May be null, in which case no image is applied to the shape.
     */
    public Object getImageSource() {
        return imageSource;
    }

    /**
     * Indicates the associated shape's image source. May be null, in which case no image is applied to the shape.
     */
    public ShapeAttributes setImageSource(Object imageSource) {
        this.imageSource = imageSource;
        return this;
    }

    /**
     * Indicates whether the shape should be depth-tested against other objects in the scene. If true, the shape may be
     * occluded by terrain and other objects in certain viewing situations. If false, the shape will not be occluded by
     * terrain and other objects.
     */
    public boolean isDepthTest() {
        return depthTest;
    }

    /**
     * Indicates whether the shape should be depth-tested against other objects in the scene. If true, the shape may be
     * occluded by terrain and other objects in certain viewing situations. If false, the shape will not be occluded by
     * terrain and other objects.
     */
    public ShapeAttributes setDepthTest(boolean depthTest) {
        this.depthTest = depthTest;
        return this;
    }

    /**
     * Indicates whether this shape should draw vertical lines extending from its specified positions to the ground.
     */
    public boolean isDrawVerticals() {
        return drawVerticals;
    }

    /**
     * Indicates whether this shape should draw vertical lines extending from its specified positions to the ground.
     */
    public ShapeAttributes setDrawVerticals(boolean drawVerticals) {
        this.drawVerticals = drawVerticals;
        return this;
    }

    /**
     * Indicates whether lighting is applied to the shape.
     */
    public boolean isApplyLighting() {
        return applyLighting;
    }

    /**
     * Indicates whether lighting is applied to the shape.
     */
    public ShapeAttributes setApplyLighting(boolean applyLighting) {
        this.applyLighting = applyLighting;
        return this;
    }
}
