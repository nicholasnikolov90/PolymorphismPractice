# Shapes report
Author: Nick Nikolov

## UML class diagram
```plantuml
@startuml

class Shape2D{
-width: double
-height: double

+Shape2D
+Shape2D(w: double, h: double)

+getWidth(): double
+setWidth(w: double): void
+getHeight(): double
+setHeight(h: double): void

}

class Square{
~referencePoint: Point2D

+ Square()
+ Square(l: double)

+setHeight(l: double): void
+setWidth(l: double): void
+getCircumference(): double
+getArea(): double

}

class RightTriangle{
+RightTriangle()
+RightTriangle(w: double, h: double)

+getCircumference(): double
+getArea(): double

}

class Rectangle{
~referencePoint: Point2D

+ Rectangle()
+ Rectangle(w: double, h: double)

+getCircumference(): double
+getArea(): double
+getReferencePoint(): Point2D
+setReferencePoint(p: Point2D): void
+getAllShapePoints(): Point2D[]


}

Interface IShapePoints{}

class Rectangle extends Shape2D
class Square extends Shape2D
class RightTriangle extends Shape2D

class Rectangle implements IShapePoints




@enduml
```

This screenshot showws the PlantUML diagram

![Example screenshot](ShapesUML.png)


## Execution and Testing

This screenshot shows successful execution of the TestShapes program

![Example screenshot](TestShapesOutput.png)
