from behave import *
from selenium import webdriver
@given(u'chrome is launched')
def step_impl(context):
    context.driver = webdriver.Chrome(executable_path="E:\eclipse\chromedriver_win32\chromedriver.exe")

@when(u'user navigate to Myntra webpage')
def step_impl(context):
    context.driver.get("https://www.myntra.com/")

@when(u'user enter product in search bar')
def step_impl(context):
    context.driver.find_element_by_xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/input").send_keys("matte lipstick")


@when(u'user press the search icon')
def step_impl(context):
    context.driver.find_element_by_xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/a/span").click()

@when(u'user successfully navigate to the product list page')
def step_impl(context):
   context.driver.get("https://www.myntra.com/lipstick/faces-canada/faces-canada-ultimepro-hd-intense-matte-lips--primer-tease-14-14gm/8435007/buy")

@then(u'user added the item to cart')
def step_impl(context):
    context.driver.find_element_by_xpath("/html/body/div[2]/div/div/div/main/div[2]/div[2]/div[4]/div/div[1]").click()