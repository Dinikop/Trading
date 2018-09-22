package com.dnk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chart {

    private String ticket;

    private List<Candle> candles = new ArrayList<>();

    public Chart(String fileName, String ticket) {

        this.ticket = ticket;

        Path pathFile = Paths.get(fileName);

        List<String> content = new ArrayList<>();

        try {
            content = Files.readAllLines(pathFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s :content) {
            candles.add(new Candle(s));
        }

    }

    public List<Candle> getCandles() {
        return Collections.unmodifiableList(candles);
    }

    public String getTicket() {
        return ticket;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ticket);
        sb.append("\n");

        for (Candle candle :candles) {
            sb.append(candle);
            sb.append("\n");
        }

        return sb.toString();
    }

    public int getChartSize() {
        return candles.size();
    }

    public List<String> getDates() {
        ArrayList<String> dates = new ArrayList<>();
        for (Candle candle :candles) {
            dates.add(candle.getDATE());
        }
        return dates;
    }

    public boolean equalsDates(Chart anotherChart) {
        boolean flag = true;

        if (this.getChartSize() != anotherChart.getChartSize()) return false;

        else {

            for (int i = 0; i < this.getChartSize(); i++) {
                String thisDate = this.getDates().get(i);
                String anotherChartDate = anotherChart.getDates().get(i);
                flag = flag && thisDate.equals(anotherChartDate);
            }

        }
        return flag;
    }

//    public void equatingDimensions(Chart anotherChart) {
//        Chart lagerChart;
//        Chart smallerChart;
//
//        if (this.getChartSize() == anotherChart.getChartSize()) {
//            lagerChart = this;
//            smallerChart = anotherChart;
//        }
//
//        if (this.getChartSize() < anotherChart.getChartSize()) {
//            lagerChart = anotherChart;
//            smallerChart = this;
//        }
//
//    }
}
