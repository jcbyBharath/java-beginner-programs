Streams: 
----------------
1. In order to iterate through any collection, we generally use Iterator and we either process the data or consume the data.
2. Streams take the data from the source 
         ----------> Do all the processing 
                      ------> just consume the data or return the data into the container that user wants
3. Declarative, Flexible and Parallelizable.

**_Data Source ---> apply operations ------> consume or collect data._**

1. Source 
2. Zero or more Intermediate Operations
3. Terminal Operation

Example: Intermediate Operations:
- filter()
- map()
- flatMap()
- distinct()
- sorted()
- peek()
- limit()
- skip()

Example: Terminal Operations: 
- collect() -> Collects all elements into a container (Collection). 
- count() 
- reduce() 
- forEach() 
- forEachOrdered()
- min()
- max()
- anyMatch() -> Is there any element that meets this condition ? True/False
- allMatch() -> do all elements of the stream meet this condition ? True/False
- noneMatch() -> Does no element meet this condition ? True/False
- findAny()
- findFirst()
- toArray()

