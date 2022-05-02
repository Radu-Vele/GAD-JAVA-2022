package Lab5.Ch1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk <F extends Currency, T extends Currency>{

    public int rate = 4;
    //more complex exchange rate could be a matrix based on the id on the currencies
    //rate[id_1][id_2];. nmv

    public T convert(F from, Class<T> toClass) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        T toReturn = null;

        int value = from.getValue() * rate;

        toReturn = toClass.getDeclaredConstructor(Integer.class).newInstance(value);

        return toReturn;
    }
}
