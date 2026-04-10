Logger (Singleton)
has a private static class that creates a static final INSTANCE
private constructor that builds the logger.
   ↓
Decorators (Timestamp, Level)
Logger : Base interface
BasicLogger : Concrete Base that injects Output Strategy
LogDecorator: Base Decorator
TimestampLogger: Concrete Decorator
LevelDecorator: Concrete Decorator that uses LogLevel enum
   ↓
Output Strategy (Console / File)
SinkStrategy : Base Strategy
ConsoleStrategy: Concrete Strategy
FileStrategy: Concrete Strategy