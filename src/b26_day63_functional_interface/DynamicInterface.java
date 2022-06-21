package b26_day63_functional_interface;
@FunctionalInterface
public interface DynamicInterface<T> { //add <T> in this line for generic type to be usable in method below
    void test (T t);//T generic type; t parameter name
}
