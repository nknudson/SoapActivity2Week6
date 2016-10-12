package com.daehosting.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by nataliya.knudson on 10/11/2016.
 */
public class TemperatureConversionsTest {
    @Test
    public void celciusToFahrenheitTest () throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celciusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The celcius to Fahrenheit conversion failed",
                celciusToFahrenheitResult, BigDecimal.valueOf(32));
    }
    @Test
    public void fahrenheitToCelciumTest() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal fahrenheitToCelciusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(0.0));
        assertEquals("The  Fahrenheit to celcius conversion failed",
                fahrenheitToCelciusResult, BigDecimal.valueOf(-17.77777775));

    }
    @Test
    public void windChillInFahrenheitTest()throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillFahrenheit = service.windChillInFahrenheit(BigDecimal.valueOf(0.0), BigDecimal.valueOf(55));
        assertEquals("Windchill in F", windChillFahrenheit, BigDecimal.valueOf(-76.90199989) );

        }
        @Test
    public void windChillInCelciusTest() throws Exception{
            TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
            BigDecimal windChillCelcius = service.windChillInCelsius(BigDecimal.valueOf(0.0),BigDecimal.valueOf(55));
            assertEquals("Windchill in C", windChillCelcius, BigDecimal.valueOf(-24.99));
        }






}