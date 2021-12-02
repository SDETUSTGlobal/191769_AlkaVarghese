import time
from behave import *
from selenium import webdriver
@given('launch chrome browser')
def step_impl(context):
    context.driver = webdriver.Chrome(executable_path="E:\eclipse\chromedriver_win32\chromedriver.exe")
    #context.driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1637854216&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f0%2f%3fstate%3d1%26redirectTo%3daHR0cHM6Ly9vdXRsb29rLmxpdmUuY29tL21haWwvMC9pbmJveC8%26RpsCsrfState%3d71297df2-e8b9-b349-ada6-6f7d5f7f89a4&id=292841&aadredir=1&whr=gmail.com&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015")

@when('the user open outlook login page')
def step_impl(context):
    context.driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1637854216&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f0%2f%3fstate%3d1%26redirectTo%3daHR0cHM6Ly9vdXRsb29rLmxpdmUuY29tL21haWwvMC9pbmJveC8%26RpsCsrfState%3d71297df2-e8b9-b349-ada6-6f7d5f7f89a4&id=292841&aadredir=1&whr=gmail.com&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015")

@then('the user enter username and password and login')
def step_impl(context):
    context.driver.find_element_by_id("i0116").send_keys("angelrose060599@gmail.com")
    context.driver.find_element_by_id("idSIButton9").click()
    time.sleep(3)
    context.driver.find_element_by_name("passwd").send_keys("Sapzapqap")
    time.sleep(3)
    context.driver.find_element_by_id("idSIButton9").click()

#@then('the user press the login')
#def step_impl(context):
#   context.driver.find_element_by_id("idSIButton9").click()
