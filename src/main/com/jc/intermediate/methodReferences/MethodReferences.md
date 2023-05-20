Method References:
 1. Constructor -> ClassName::new
 2. static method -> ClassName::staticMethodName
 3. Instance method an existing Object -> object::InstanceMethodName
 4. Instance method of an aribitrary Object -> ClassName::InstanceMethodName

-------------------
1. Method References can be used in place of Lambda as well. 
[If there is an already existing behaviour we don't have to recreate it again using Lambda expressions, we can use Method References]
Ex: System.out.println(e) -> It consumes but will not return anything, so we can use in the consumer case.
2. Consumer<String> consumer = (e) -> System.out.println(e); Method reference it instance method of an existing object.
[can be written as - Consumer<String> consumer = System.out::println]
3. In the same way in supplier -> Math::random
4. 
a. Constructor -> ClassName::new
Method reference to constructor.
Ex: Function<Runnable, Thread> thread = Thread::new;
Runnable run1 = () -> System.out.println("executed 1");
Runnable run2 = () -> System.out.println("executed 2");
thread.apply(run1);
thread.apply(run2);

b. static method -> ClassName::staticMethodName

c. Instance method an existing Object -> object::InstanceMethodName

d. Instance method of an arbitrary Object -> ClassName::InstanceMethodName
 Here the method is applied directly on the object, we are not passing any inputs here.. 
Like String.length method -> String::length




