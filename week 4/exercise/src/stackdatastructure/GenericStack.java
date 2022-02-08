package stackdatastructure;

import java.util.ArrayList;

public class GenericStack<T>
{
    private ArrayList<T> values;

    public GenericStack()
    {
        values = new ArrayList<>();
    }

    public boolean isEmpty()
    {
        return values.isEmpty();
    }

    public void push(T i)
    {
        values.add(i);
    }

    public T pop()
    {
        return values.remove(getLastIndex());
    }

    public T top()
    {
        return values.get(getLastIndex());
    }

    private int getLastIndex()
    {
        return values.size() - 1;
    }
}
