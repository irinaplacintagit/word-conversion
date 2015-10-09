package com.challenge;

import com.challenge.model.ConversionMapper;
import com.challenge.model.IntNumberFormat;


/**
 * @author iplacinta
 *
 */
public class Conversion
{
    public static final String AND_SEPARATOR = " and ";
    
    public static String convert(int value)
    {
        if (value < 0 || value > 999999999)
        {
            return "undefined";
        }
        
        if (ConversionMapper.numberWordMap.containsKey(value))
        {
            return (ConversionMapper.numberWordMap.get(value));
        }
        else
        {
            IntNumberFormat currentNumber = new IntNumberFormat();
            for (Integer unit: ConversionMapper.unitWordMap.keySet())
            {
                currentNumber.setDiv(value / unit);
                currentNumber.setMod(value  % unit);
                currentNumber.setUnit(unit);
                if (currentNumber.getDiv() > 0)
                {
                    String unitWord = ConversionMapper.unitWordMap.get(unit);
                    if (currentNumber.getMod() == 0)
                    {
                        return convert(currentNumber.getDiv()) + " " + unitWord; 
                    }
                    else if (currentNumber.getMod() > 100)
                    {
                        return convert(currentNumber.getDiv()) + " " + unitWord + " " + convert(currentNumber.getMod());
                    }
                    else
                    {
                        return convert(currentNumber.getDiv()) + " " + unitWord + AND_SEPARATOR + convert(currentNumber.getMod());
                    }
                }
            };
            currentNumber.setDiv(value / 10);
            currentNumber.setMod(value  % 10);
            if (currentNumber.getDiv() > 0)
            {
                return convert(currentNumber.getDiv() * 10) + " " + convert(currentNumber.getMod());
            }
            else
            {
                return convert(currentNumber.getNumber());
            }
        }
    }
}
