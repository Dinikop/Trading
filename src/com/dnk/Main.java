package com.dnk;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Chart EURUSD = new Chart("E:\\Котировки\\Экспорт из MT4\\EURUSD1440.csv", "EURUSD");
        Chart CHFJPY = new Chart("E:\\Котировки\\Экспорт из MT4\\CHFJPY1440.csv", "CHFJPY");
        Chart EURCHF = new Chart("E:\\Котировки\\Экспорт из MT4\\EURCHF1440.csv", "EURCHF");
        Chart EURGBP = new Chart("E:\\Котировки\\Экспорт из MT4\\EURGBP1440.csv", "EURGBP");
        Chart EURJPY = new Chart("E:\\Котировки\\Экспорт из MT4\\EURJPY1440.csv", "EURJPY");
        Chart GBPCHF = new Chart("E:\\Котировки\\Экспорт из MT4\\GBPCHF1440.csv", "GBPCHF");
        Chart GBPJPY = new Chart("E:\\Котировки\\Экспорт из MT4\\GBPJPY1440.csv", "GBPJPY");
        Chart GBPUSD = new Chart("E:\\Котировки\\Экспорт из MT4\\GBPUSD1440.csv", "GBPUSD");
        Chart USDCHF = new Chart("E:\\Котировки\\Экспорт из MT4\\USDCHF1440.csv", "USDCHF");
        Chart USDJPY = new Chart("E:\\Котировки\\Экспорт из MT4\\USDJPY1440.csv", "USDJPY");


        System.out.println("Charts sizes: ===========================");

        System.out.println("EURUSD " + EURUSD.getChartSize());
        System.out.println("CHFJPY " + CHFJPY.getChartSize());
        System.out.println("EURCHF " + EURCHF.getChartSize());
        System.out.println("EURGBP " + EURGBP.getChartSize());
        System.out.println("EURJPY " + EURJPY.getChartSize());
        System.out.println("GBPCHF " + GBPCHF.getChartSize());
        System.out.println("GBPJPY " + GBPJPY.getChartSize());
        System.out.println("GBPUSD " + GBPUSD.getChartSize());
        System.out.println("USDCHF " + USDCHF.getChartSize());
        System.out.println("USDJPY " + USDJPY.getChartSize());

        System.out.println("End chart sizes ==========================");

        List<String> EURUSDDates = EURUSD.getDates();
        List<String> EURCHFDates = EURCHF.getDates();
        List<String> CHFJPYDates = CHFJPY.getDates();

//        for (int i = 0; i < EURUSDDates.size(); i++) {
//            if (!EURUSDDates.equals(CHFJPYDates)) {
//                System.out.println(EURUSDDates.get(i) + " " + CHFJPYDates.get(i));
//            }
//        }
    }
}
