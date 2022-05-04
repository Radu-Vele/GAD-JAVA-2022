package Lab5.ch1;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk <F extends Currency, T extends Currency>{

    public double[][] rate = new double[3][3];

    public ExchangeDesk() {
    }

    public T convert(F from, Class<T> toClass) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        T toReturn = null;
        double init = 0;
        toReturn = toClass.getDeclaredConstructor(Double.class).newInstance(init);
        double value = from.getValue() * rate[from.getID()][toReturn.getID()];
        toReturn.setValue(value);
        return toReturn;
    }

    public void addRate(Class<F> from, Class<T> toClass, Double newRate) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException{
        double val = 0.0;
        F fromObj = from.getDeclaredConstructor(Double.class).newInstance(val);
        T toObj = toClass.getDeclaredConstructor(Double.class).newInstance(val);

        rate[fromObj.getID()][toObj.getID()] = newRate;
    }
}
