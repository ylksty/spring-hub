package com.ylkget.pattern.behavior.visit.xml.visitor;

import com.ylkget.pattern.behavior.visit.xml.shapes.Circle;
import com.ylkget.pattern.behavior.visit.xml.shapes.CompoundShape;
import com.ylkget.pattern.behavior.visit.xml.shapes.Dot;
import com.ylkget.pattern.behavior.visit.xml.shapes.Rectangle;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/31 09:02
 */
public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
