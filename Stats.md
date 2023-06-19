# Stats report
Author: Nick Nikolov

## UML class diagram
```plantuml
@startuml

+class Stats{
-grades: int[]
-count: int
-currentInput: int

+Stats()
+getCurrentInput(): int
+setCurrentInput(ci: int): void
+sort(): void
+getMean(): double
+getMedian(): double
+add(g: int): void
+toString(): String
}

Interface ActionListener

class StatsGUI{
-inputField: JTextField
-display: JTextArea
-reset: JButton
-displayStats: JButton
-stats: Stats

+StatsGUI(title: String)
+actionPerformed(e: ActionEvent): void
+{static} main(args: String[]): void

}



StatsGUI --> Stats : uses
class StatsGUI implements ActionListener

@enduml
```

This screenshot shows the PlantUML diagram for the Stats and StatsGUI classes

![Example screenshot](StatsUML.png)


## Execution and Testing
This screenshot shows successful execution of the Stats program using an even number of inputs

![Example screenshot](StatsEven.png)

This screenshot shows successful execution of the Stats program using an odd number of inputs

![Example screenshot](StatsOdd.png)

# Reflection

Stats - I liked getting more familiar with getting user inputs and performing an action based on inputs and buttons clicked. e.getSource was a mystery to me before this assignment. Feels like magic.

shapes - circumference is not used for non-circular shapes. The correct word should be perimeter.
