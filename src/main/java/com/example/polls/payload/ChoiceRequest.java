package com.example.polls.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * User: nataliechen (nataliechen@coupang.com)
 * Date: 10/5/18
 * Time: 11:21 AM
 */
public class ChoiceRequest {
    @NotBlank
    @Size(max = 40)
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
