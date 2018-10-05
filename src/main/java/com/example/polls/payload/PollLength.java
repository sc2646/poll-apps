package com.example.polls.payload;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * User: nataliechen (nataliechen@coupang.com)
 * Date: 10/5/18
 * Time: 11:24 AM
 */
public class PollLength {
    @NotNull
    @Max(7)
    private Integer days;

    @NotNull
    @Max(23)
    private Integer hours;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
