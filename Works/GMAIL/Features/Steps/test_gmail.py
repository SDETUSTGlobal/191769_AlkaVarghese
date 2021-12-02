import pytest

from pytest_bdd import scenarios, given, when, then, parsers
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

# Constants

GMAIL_HOME = 'https://accounts.google.com/signin/v2/challenge/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward&TL=AM3QAYYHLL3JoTBZrX_rSApuE93pXCnFPSSrb0Q8gOkbBhxNjBp1ScepOBbbZtlR'


scenarios('../GmailTest.feature')

@pytest.fixture
def browser():
    b = webdriver.Chrome(executable_path="E:\eclipse\chromedriver_win32\chromedriver.exe")
    b.implicitly_wait(10)
    yield b
    b.quit()

@given('the Gmail login page is displayed')
def ddg_home(browser):
    browser.get(GMAIL_HOME)

@when(parsers.parse('the user enters username and password'))
def search_phrase(browser):
    search_input = browser.find_element_by_id('identifierId')
    search_input.send_keys('angelrose060599@gmail.com')
    search_input = browser.find_element_by_xpath('/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span')
    search_input.click()
    search_pass = browser.find_element_by_name('password')
    search_pass.send_keys('Applepie123')

@then(parsers.parse('the user click on next'))
def search_product(browser):
    search_pro = browser.find_element_by_xpath('/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span')
    search_pro.click()
