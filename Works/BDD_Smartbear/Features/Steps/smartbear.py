from behave import*
from selenium import webdriver

@given('chrome is launched')
def step_impl(context):
   context.driver=webdriver.Chrome(executable_path="E:\eclipse\chromedriver_win32\chromedriver.exe")
   context.driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx")

@when('the user enter username password and click login')
def step_impl(context):
    context.driver.find_element_by_id('ctl00_MainContent_username').send_keys("Tester")
    context.driver.find_element_by_id("ctl00_MainContent_password").send_keys("test")
    context.driver.find_element_by_id('ctl00_MainContent_login_button').click()

@when('the user select view all orders')
def step_impl(context):
    context.driver.find_element_by_link_text('View all orders').click()
    context.driver.find_element_by_id('ctl00_MainContent_btnCheckAll').click()
    context.driver.find_element_by_id('ctl00_MainContent_btnUncheckAll').click()

@when('the user select view all products')
def step_impl(context):
    context.driver.find_element_by_link_text('View all products').click()

@when('the user select order')
def step_impl(context):
    context.driver.find_element_by_link_text('Order').click()

@then('the user click logout')
def step_impl(context):
    context.driver.find_element_by_id('ctl00_logout').click()
