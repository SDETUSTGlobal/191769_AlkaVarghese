from behave import*
import time
from selenium import webdriver

@given('chrome is launched')
def step_impl(context):
   context.driver=webdriver.Chrome(executable_path="E:\eclipse\chromedriver_win32\chromedriver.exe")
   context.driver.get("http://127.0.0.1:5000/")

@when('the user enter username userid company name emailid')
def step_impl(context):
    context.driver.find_element_by_id('fname').send_keys("LAYA")
    time.sleep(3)
    context.driver.find_element_by_id("userid").send_keys("5656")
    time.sleep(3)
    context.driver.find_element_by_id("cmpnyname").send_keys("TCS")
    time.sleep(3)
    context.driver.find_element_by_id("idmail").send_keys("laya@gmail.com")
    time.sleep(3)

@then('the user click submit')
def step_impl(context):
    context.driver.find_element_by_id('bttnname').click()
    time.sleep(3)