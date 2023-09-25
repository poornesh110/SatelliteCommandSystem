# SatelliteCommandSystem
Developed a Satellite Command System that simulates controlling a satellite in orbit. The satellite starts in a default initial state and can accept a series of commands to change its orientation, solar panel status, and data collection.
## Functional Requirements
### The system implements the following functional requirements as per the problem statement:
#### *Initialize the Satellite.
#### *Rotate the satellite based on a specified direction.
#### *Activate or deactivate the solar panels.
#### *Collect data if the solar panels are active.
## Implementation Details
### The codebase is implemented in Java and adheres to best practices, SOLID principles, and design patterns to ensure high code quality and maintainability.
### Implemented necessary classes: Satellite, InvalidOrientationException, DataCollectionException.
### Proper exception handling for handling invalid orientation, and data collection when solar panels are inactive.
## Exception Handling
### Exception handling is incorporated to handle various scenarios:
#### *InvalidOrientationException: Thrown when an invalid orientation is provided.
#### *DataCollectionException: Thrown when an attempt is made to collect data when solar panels are inactive.
