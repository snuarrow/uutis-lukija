/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uutislukija;

import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;
/**
 *
 * @author hexvaara
 */
public class AppTest extends FluentTest
{
    public WebDriver webDriver = new HtmlUnitDriver();
    @Override
    public WebDriver getDefaultDriver()
    {
        return webDriver;
    }
    
    @ClassRule
    public static ServerRule server = new ServerRule();
    
    @Test
    public void rootTest_contains_suosituin()
    {
        goTo("http://localhost:4567/");
        assertThat(pageSource()).contains("suosituin");
    }
    @Test
    public void rootTest_contains_uusin()
    {
        goTo("http://localhost:4567/");
        assertThat(pageSource()).contains("viimeisin");
    }
    @Test
    public void rootTest_contains_heading()
    {
        goTo("http://localhost:4567/");
        assertThat(pageSource()).contains("Hackernews-uutiset");
    }
}
